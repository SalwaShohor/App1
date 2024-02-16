package lesson7.Exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDecryption {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("encrypted.txt");
             FileWriter writer = new FileWriter("decrypted.txt")) {

            int key = 3; // Use the same key used for encryption
            int character;

            while ((character = reader.read()) != -1) {
                // Decrypt the character by shifting back
                char decryptedChar = (char) (character - key);
                writer.write(decryptedChar);
            }

            System.out.println("File decrypted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
