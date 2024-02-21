package lesson11.quiz4.Question16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Question16 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("Where");
        words.add("whether");
        
        System.out.println("\np -> !!!!true : ");
        processStringArray(words,p -> !!!!true);
        System.out.println("\np -> p.length() < 7 : ");
        processStringArray(words,p -> p.length() < 7);
        System.out.println("\np -> p.length() >= 1 : ");
        processStringArray(words,p -> p.length() >= 1);
        System.out.println("\nString p -> p.length() > 0 : ");
        //processStringArray(words,String p -> p.length() > 0);
        System.out.println("\np -> !!false : ");
        processStringArray(words,p -> !!false);
        System.out.println("\np -> true : ");
        processStringArray(words,p -> true);
        System.out.println("\n(String p) -> p.length() < 100 : ");
        processStringArray(words,(String p) -> p.length() < 100);

    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
