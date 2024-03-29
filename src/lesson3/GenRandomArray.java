// package lesson3;

// import java.util.Arrays;

// public class GenRandomArray {
//     public static void main(String[] args) {
//         int len = 10;
//         int min = 0;
//         int max = 99;
//         int[] randoms = genRandomIntArray(len, min, max);
//         System.out.println(Arrays.toString(randoms));
//     }

//     public static int[] genRandomIntArray(int length, int min, int max) {
//         int[] a = new int[length];
//         for (int i = 0; i < length; i++) {
//             a[i] = (int) Math.round(Math.random() * (max - min) + min);
//         }
//         return a;
//     }
// }

import java.util.Arrays;
import java.util.Random;

public class GenRandomArray {
    public static void main(String[] args) {
        int len = 10;
        int min = 0;
        int max = 99;
        int[] randoms = generateRandomArray(len, min, max);
        System.out.println(Arrays.toString(randoms));
    }

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}
