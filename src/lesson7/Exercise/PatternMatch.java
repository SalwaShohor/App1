package lesson7.Exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Match found at index: " + matcher.start());
        }
    }
}
