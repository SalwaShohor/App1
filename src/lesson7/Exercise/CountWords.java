package lesson7.Exercise;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Total word count: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    

