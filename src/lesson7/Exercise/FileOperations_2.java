package lesson7.Exercise;

import java.io.*;
import java.net.HttpURLConnection;
import java.util.Scanner;
import java.util.regex.Matcher; //regular expression
import java.util.regex.Pattern;
import java.net.URL;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path; 
//imports the Path interface from the java.nio.file package. 
//The Path interface represents the hierarchical path to a file or directory in the file system.
import java.nio.file.Paths;
// imports the Paths class from the java.nio.file package. 
//The Paths class provides factory methods for creating instances of the Path interface.





public class FileOperations_2 {

    public static void main(String[] args) {
        String fileName = "sample2.txt";

        // Create an instance of ReadFile
        ReadFile fileReader = new ReadFile();

        // Call the readFile method from the ReadFile instance
        try {
            String fileContent = fileReader.readFile(fileName);

            // Print the content to the console
            System.out.println("File Content:");
            System.out.println(fileContent);

        } catch (IOException e) {
            // Handle IOException (e.g., file not found, unable to read)
            e.printStackTrace();
        }

        // Pattern match text expression
        patternMatch("This is a sample text with pattern");

    }  

     // Function to perform pattern matching on a text expression
     private static void patternMatch(String text) {
        // Prompt the user to enter a pattern to match
        System.out.print("Enter a pattern to match: ");

        // Read the user's input for the pattern
        String patternString = new Scanner(System.in).nextLine();

        // Compile the entered pattern string into a regular expression pattern
        Pattern pattern = Pattern.compile(patternString);

        // Create a matcher object for the input text using the compiled pattern
        Matcher matcher = pattern.matcher(text);

        // Display the matches for the entered pattern in the input text
        System.out.println("Matches for pattern \"" + patternString + "\":");
        while (matcher.find()) {
            // Print each match found in the text
            System.out.println(matcher.group());
        }
        System.out.println();  // Add an empty line for better formatting
    }
}


    


