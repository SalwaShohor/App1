package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreetUser {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user to input their first name
        System.out.print("Enter your first name: ");
        String firstName = reader.readLine();

        // Ask the user to input their last name
        System.out.print("Enter your last name: ");
        String lastName = reader.readLine();

        // Greet the user using the provided names
        System.out.println("Hello, " + firstName + " " + lastName + "!");

        // Close the BufferedReader to prevent resource leak
        reader.close();
    }
}
