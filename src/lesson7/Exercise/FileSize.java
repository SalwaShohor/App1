package lesson7.Exercise;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        long fileSize = file.length();
        System.out.println("File size: " + fileSize + " bytes");
    }
}
