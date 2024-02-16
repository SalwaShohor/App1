package lesson7.Exercise;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File fileToDelete = new File("sample.txt");
        if (fileToDelete.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
