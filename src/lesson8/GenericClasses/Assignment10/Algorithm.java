package lesson8.GenericClasses.Assignment10;

import java.util.Arrays;

// Generic class Algorithm with type parameter T
public class Algorithm<T extends Comparable<T>> {
    // Generic method to execute a specific algorithmic operation on an array of type T
    public void execute(T[] input) {
        // Sorting algorithm (example: bubble sort)
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j].compareTo(input[j + 1]) > 0) {
                    // Swap elements if they are in the wrong order
                    T temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of Algorithm class with Integer
        Algorithm<Integer> integerAlgorithm = new Algorithm<>();
        Integer[] intArray = {4, 2, 7, 1, 5};

        System.out.println("Before sorting: " + Arrays.toString(intArray));
        integerAlgorithm.execute(intArray);
        System.out.println("After sorting: " + Arrays.toString(intArray));

        // Example usage of Algorithm class with String
        Algorithm<String> stringAlgorithm = new Algorithm<>();
        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};

        System.out.println("Before sorting: " + Arrays.toString(stringArray));
        stringAlgorithm.execute(stringArray);
        System.out.println("After sorting: " + Arrays.toString(stringArray));
    }

    
}
