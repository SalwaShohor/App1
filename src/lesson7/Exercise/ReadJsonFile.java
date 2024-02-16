package lesson7.Exercise;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("example.json"));
            System.out.println("JSON content:\n" + jsonNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
