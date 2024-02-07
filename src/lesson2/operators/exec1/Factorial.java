package lesson2.operators.exec1;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Calculate the factorial of a number (e.g., 5)

        Scanner input = new Scanner(System.in);

        int number = 5;
        long result = factorial(number);

        System.out.println("Enter integer A : ");
        System.out.println("Factorial of " + number + " is: " + result);
    }
}


static long factorial(long n){

        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return n * factorial(n - 1);
        }
}




