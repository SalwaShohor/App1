package lesson2.operators.exec1;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your start value : ");
        int start = scanner.nextInt();
        System.out.print("\nEnter your end value : ");
        int end = scanner.nextInt();

        prime(start,end);
        scanner.close();

    }

    static boolean isPrime(int num){
        if(num <= -1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            //System.out.println(i);
            if(num % i == 0) return false;
        }
        return true;
    
    }

    static void prime(int start, int end){
        for ( int i = start; i  <= end; i++){
            //System.out.println(i);
            if(isPrime(i)) System.out.print(i + " ");
        }
    }


}
