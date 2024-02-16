package lesson7.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word to search: ");
            String wordToSearch = scanner.nextLine().trim().toLowerCase();
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(wordToSearch)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Word found in the file.");
            } else {
                System.out.println("Word not found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
