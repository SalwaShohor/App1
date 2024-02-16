package lesson7.Exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            writer.write(input);
            System.out.println("String written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
