package lesson3;

import java.util.Scanner;

public class SequentialSearch {

    public static int seqSearch(int[] a, int k) {
        int i = 0;
        int len = a.length;

        while (i < len && a[i] != k) {
            i++;
        }

        if (i >= len) {
            i = -1;
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value to search (k): ");
        int keyToSearch = scanner.nextInt();

        int[] array = {10, 20, 30, 40, 50};

        int result = seqSearch(array, keyToSearch);

        if (result != -1) {
            System.out.println("Element " + keyToSearch + " found at index " + result);
        } else {
            System.out.println("Element " + keyToSearch + " not found in the array");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
