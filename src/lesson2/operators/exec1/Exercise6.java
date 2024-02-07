package lesson2.operators.exec1;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        int i=1;
        int n;
        int nFact = 1; // Initialize nFact to 1 for multiplication

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter n : ");
        n = scanner.nextInt();

        while (i <= n){
            nFact = nFact * i; 
            i=i+1;
        }

        System.out.println("n! = " + nFact);
    }
}

