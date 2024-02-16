package lesson7.Exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to append: ");
            String input = scanner.nextLine();
            writer.write(input);
            System.out.println("String appended to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
