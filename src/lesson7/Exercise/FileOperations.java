package lesson7.Exercise;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Read a text file and print its content
        readAndPrintFile("sample.txt");

        System.out.println("\n");

        // Count words in a text file
        countWords("sample.txt");

        System.out.println("\n");

        // Write to a text file
        writeToTextFile("output.txt");

        System.out.println("\n");

        // Copy content from one text file to another
        copyFiles("sample.txt", "copied.txt");

        System.out.println("\n");

        // Append a string to an existing text file
        appendToFile("appended.txt");

        System.out.println("\n");

        // Search for a word in a text file
        searchWord("sample.txt");

        System.out.println("\n");

        // Delete a text file
        deleteFile("toBeDeleted.txt");

        System.out.println("\n");

        // Display file size
        displayFileSize("sample.txt");

        System.out.println("\n");

        // Encrypt and Decrypt a text file
        encryptFile("encrypt.txt", 3);
        decryptFile("encrypt.txt", 3);

        scanner.close();
    }

    // Function to read and print the content of a text file
    private static void readAndPrintFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Content of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to count words in a text file
    private static void countWords(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int wordCount = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            System.out.println("Word count in " + fileName + ": " + wordCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Function to write to a text file
    private static void writeToTextFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            System.out.print("Enter a string to write to " + fileName + ": ");
            String input = new Scanner(System.in).nextLine();
            writer.println(input);
            System.out.println("String written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to copy content from one text file to another
    private static void copyFiles(String sourceFileName, String destinationFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             PrintWriter writer = new PrintWriter(destinationFileName)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
            System.out.println("Content copied from " + sourceFileName + " to " + destinationFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to append a string to an existing text file
    private static void appendToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            System.out.print("Enter a string to append to " + fileName + ": ");
            String input = new Scanner(System.in).nextLine();
            writer.println(input);
            System.out.println("String appended to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to search for a word in a text file
    private static void searchWord(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.print("Enter a word to search in " + fileName + ": ");
            String searchWord = new Scanner(System.in).next();
            while (scanner.hasNext()) {
                if (scanner.next().equals(searchWord)) {
                    System.out.println(searchWord + " found in " + fileName);
                    return;
                }
            }
            System.out.println(searchWord + " not found in " + fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Function to delete a text file
    private static void deleteFile(String fileName) {
        File fileToDelete = new File(fileName);
        if (fileToDelete.delete()) {
            System.out.println(fileName + " deleted successfully");
        } else {
            System.out.println("Failed to delete " + fileName);
        }
    }

    // Function to display file size
    private static void displayFileSize(String fileName) {
        File file = new File(fileName);
        System.out.println("File size of " + fileName + ": " + file.length() + " bytes");
    }

    // Function to encrypt a text file using Caesar cipher
    private static void encryptFile(String fileName, int shift) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             PrintWriter writer = new PrintWriter("encrypted.txt")) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(encryptLine(line, shift));
            }
            System.out.println("File encrypted and written to encrypted.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to decrypt a text file using Caesar cipher
    private static void decryptFile(String fileName, int shift) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Decrypted content of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(decryptLine(line, shift));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to encrypt a line using Caesar cipher
    private static String encryptLine(String line, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (((c - 'A' + shift) % 26) + 'A');
                encrypted.append(shifted);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    // Function to decrypt a line using Caesar cipher
    private static String decryptLine(String line, int shift) {
        return encryptLine(line, 26 - shift); // Decryption is the same as encryption with the opposite shift
    }
}
