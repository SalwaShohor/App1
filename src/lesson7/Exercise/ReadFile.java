package lesson7.Exercise;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ReadFile {

    public String readFile(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);

        // Read all bytes from the file and convert to a string
        return new String(Files.readAllBytes(filePath));
    }
}