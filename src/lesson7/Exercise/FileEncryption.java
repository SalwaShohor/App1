package lesson7.Exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryption {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("encrypted.txt")) {

            int key = 3; // Shift characters by 3 positions (you can choose a different value)
            int character;

            while ((character = reader.read()) != -1) {
                // Encrypt the character by shifting
                char encryptedChar = (char) (character + key);
                writer.write(encryptedChar);
            }

            System.out.println("File encrypted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
