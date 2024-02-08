package lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the maximum number of values and range
        System.out.print("Enter the maximum number of values: ");
        int maxValues = scanner.nextInt();

        System.out.print("Enter the minimum value: ");
        int minValue = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int maxValue = scanner.nextInt();

        // Generate random numbers based on user input
        int[] randomArray = generateRandomArray(maxValues, minValue, maxValue);

        // Sort the array
        Arrays.sort(randomArray);

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(randomArray));

        // Calculate and display mean, mode, and median
        double mean = calculateMean(randomArray);
        int mode = calculateMode(randomArray);
        double median = calculateMedian(randomArray);

        System.out.println("Mean: " + mean);
        System.out.println("Mode: " + mode);
        System.out.println("Median: " + median);

        scanner.close();
    }

    private static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return array;
    }

    private static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    private static int calculateMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int num : array) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        return mode;
    }

    private static double calculateMedian(int[] array) {
        int length = array.length;

        if (length % 2 == 0) {
            int mid1 = array[length / 2 - 1];
            int mid2 = array[length / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return array[length / 2];
        }
    }
}
