package lesson7.Exercise;

import java.io.*;
import java.net.HttpURLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URL;
// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;


public class FileOperations {

    public class Main {
        public static void main(String[] args) {
            // ReadFile
            System.out.println("----- ReadFile -----");
            ReadFile readFile = new ReadFile();
            readFile.readAndPrint("example.txt");
    
            // CountWords
            System.out.println("----- CountWords -----");
            CountWords countWords = new CountWords();
            int wordCount = countWords.countWords("example.txt");
            System.out.println("Total word count: " + wordCount);
    
            // WriteToFile
            System.out.println("----- WriteToFile -----");
            WriteToFile writeToFile = new WriteToFile();
            writeToFile.write("example_output.txt", "Hello, this is a test!");
    
            // CopyFiles
            System.out.println("----- CopyFiles -----");
            CopyFiles copyFiles = new CopyFiles();
            copyFiles.copy("example.txt", "copied_example.txt");
    
            // AppendToFile
            System.out.println("----- AppendToFile -----");
            AppendToFile appendToFile = new AppendToFile();
            appendToFile.append("example_output.txt", " Appended text!");
    
            // SearchWord
            System.out.println("----- SearchWord -----");
            SearchWord searchWord = new SearchWord();
            boolean wordFound = searchWord.search("example.txt", "test");
            System.out.println("Word found: " + wordFound);
    
            // DeleteFile
            System.out.println("----- DeleteFile -----");
            DeleteFile deleteFile = new DeleteFile();
            deleteFile.delete("example_output.txt");
    
            // FileSize
            System.out.println("----- FileSize -----");
            FileSize fileSize = new FileSize();
            long sizeInBytes = fileSize.getSize("example.txt");
            System.out.println("File size: " + sizeInBytes + " bytes");
    
            // FileEncryption
            System.out.println("----- FileEncryption -----");
            FileEncryption fileEncryption = new FileEncryption();
            fileEncryption.encrypt("example.txt", "encrypted.txt");
    
            // FileDecryption
            System.out.println("----- FileDecryption -----");
            FileDecryption fileDecryption = new FileDecryption();
            fileDecryption.decrypt("encrypted.txt", "decrypted.txt");
    
            // ReadHttpUrl
            System.out.println("----- ReadHttpUrl -----");
            ReadHttpUrl readHttpUrl = new ReadHttpUrl();
            readHttpUrl.readAndPrint("https://www.example.com");
    
            // PatternMatch
            System.out.println("----- PatternMatch -----");
            PatternMatch patternMatch = new PatternMatch();
            patternMatch.match("example.txt", "test");
    
            // ReadJsonFile
            System.out.println("----- ReadJsonFile -----");
            ReadJsonFile readJsonFile = new ReadJsonFile();
            readJsonFile.readAndPrint("example.json");
        }
    }
    

}