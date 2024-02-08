package lesson3;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(double[] array, boolean increasing) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int indexToSwap = increasing ? findMinIdx(array, i) : findMaxIdx(array, i);

            // Swap the elements at positions i and indexToSwap
            double temp = array[i];
            array[i] = array[indexToSwap];
            array[indexToSwap] = temp;
        }
    }

    public static int findMinIdx(double[] d, int k) {
        int minIdx = k;

        for (int i = k + 1; i < d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }

        return minIdx;
    }

    public static int findMaxIdx(double[] d, int k) {
        int maxIdx = k;

        for (int i = k + 1; i < d.length; i++) {
            if (d[i] > d[maxIdx]) {
                maxIdx = i;
            }
        }

        return maxIdx;
    }

    public static void main(String[] args) {
        double[] data = {5.4, 1.2, 9.8, 2.3, 6.7};
        boolean increasingOrder = true;

        System.out.println("Original array: " + Arrays.toString(data));

        selectionSort(data, increasingOrder);

        System.out.println("Sorted array in " + (increasingOrder ? "increasing" : "decreasing") + " order: " + Arrays.toString(data));
    }
}
