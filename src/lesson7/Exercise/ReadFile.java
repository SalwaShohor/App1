package lesson7.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.io.IOException;

// public class ReadFile {

//     public String readFile(String fileName) throws IOException {
//         Path filePath = Paths.get(fileName);

//         // Read all bytes from the file and convert to a string
//         return new String(Files.readAllBytes(filePath));
//     }
// }