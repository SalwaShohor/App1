package lesson4.quiz2;
import java.util.function.Predicate;

public class question4 {

    public static void main(String[] args) {
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        processStringArray(arr, func);
    }

    private static void processStringArray(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }


}
