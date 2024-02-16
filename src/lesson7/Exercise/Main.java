package lesson7.Exercise;

public class Main {
    public static void main(String[] args) {
        // Read a text file and print its content
        TextFileReader.printFileContent("example.txt");

        // Count words in a text file
        int wordCount = WordCounter.countWords("example.txt");
        System.out.println("Word count: " + wordCount);

        // Write to a text file
        TextFileWriter.writeToFile("output.txt", "Hello, this is a sample text.");

        // Copy files
        FileCopier.copyFile("source.txt", "destination.txt");

        // Append to a text file
        TextFileAppender.appendToFile("existingFile.txt", "This text is appended.");

        // Search for a word in a text file
        boolean wordFound = WordSearcher.searchWord("example.txt", "sample");
        System.out.println("Word found: " + wordFound);

        // Delete a text file
        FileDeleter.deleteFile("toBeDeleted.txt");

        // Get the size of a text file
        long fileSize = FileSizeCalculator.getFileSize("example.txt");
        System.out.println("File size: " + fileSize + " bytes");

        // Encrypt a text file
        FileEncryption.encryptFile("input.txt", "encrypted.txt", 3);

        // Decrypt a text file
        FileDecryption.decryptFile("encrypted.txt", "decrypted.txt", 3);

        // Read from an HTTP URL and print content
        HttpURLReader.printURLContent("https://www.example.com");

        // Pattern match text expression and print the match
        TextPatternMatcher.matchPattern("This is a sample text.", "\\bsample\\b");

        // Read a JSON file and map to an object
        JsonFileReader.readAndMapJsonFile("example.json");
    }
}
