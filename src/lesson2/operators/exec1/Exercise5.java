package lesson2.operators.exec1;
import java.util.Scanner;

public class Exercise5 {

    int a;
    int b;
    int c;
    int m = 0;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);        
        int a;
        int b;
        int c;
        int m = 0;

        System.out.print("\n a : ");
        a = input.nextInt();

        System.out.print("\n b : ");
        b = input.nextInt();

        System.out.print("\n c : ");
        c = input.nextInt();

        input.close();

        if ( a <= b ){
            m = b;
        }else{
            m = a;
        }

        if ( m <= c ){
            m = c;
        }else{
            System.out.print("\nMaximum = " + m);
        }

    }




    
}
