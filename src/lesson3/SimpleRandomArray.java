package lesson3;
import java.util.Arrays;
import java.util.Random;

public class SimpleRandomArray {
    public static void main(String[] args) {
        int len = 10;
        int min = 10;
        int max = 99;
        int[] randoms = generateRandomArray(len, min, max);
        System.out.println(Arrays.toString(randoms));
    }

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int rand=random.nextInt(max);
            array[i] = rand > min ? rand : rand + min  ;
            
            //generates a random integer between 0 (inclusive) and (max - min + 1) (exclusive). 
            //It effectively covers the range from 0 to max - min.
        }

        return array;
    }
}
