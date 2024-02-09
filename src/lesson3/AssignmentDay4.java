package lesson3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AssignmentDay4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of values: ");
        int totalValue = scanner.nextInt();

        System.out.print("Enter the minimum value: ");
        int minValue = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int maxvalue = scanner.nextInt();

        // generate random numbers based on user input
        int[] randomArray = generateRandomArray(totalValue, minValue, maxvalue);

        // sort the array
        Arrays.sort(randomArray);

        // display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(randomArray));

        //calculate and display mean, mode, and median
        double mean = calculateMean(randomArray);
        int mode = calculateMode(randomArray);
        double median = calculateMedian(randomArray);

        System.out.println("Mean: " + mean);
        System.out.println("Mode: " + mode);
        System.out.println("Median: " + median);

        scanner.close();

    }

    public static int[] generateRandomArray(int length, int min, int max){
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int rand=random.nextInt(max);
            array[i] = rand > min ? rand : rand + min  ;
        }

        return array;
    }

    private static double calculateMean(int[] array){
        int sum = 0;
        for (int num : array){ 
        // (int num : array) is part of the enhanced for 
        // loop (also known as the foreach loop) in Java. It is used for 
        // iterating over elements of an array or other iterable objects, 
        // like collections.
            sum = sum + num;
        }
        // converts the value of sum (which is an integer) to a double
        return (double) sum / array.length; 
    }

    private static int calculateMode(int[] array){
        Arrays.sort(array);

        int maxFrequency = 0;
        int currentFrequency = 1;
        int mode = array[0];

        for (int i = 1; i < array.length; i++){
            if ( array[i] == array[i-1]) {
                currentFrequency++;
            }  else {
                currentFrequency = 1;
            }

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mode = array[i];
            }
        }
        return mode;
    }

    private static double calculateMedian(int [] array){
        int length = array.length;

        if (length % 2 == 0){
            int middle1 = array[length / 2 -1];
            int middle2 = array[length / 2];
            return (double) (middle1 + middle2) / 2;
        } else {
            return array[length / 2];
        }

    }


}




