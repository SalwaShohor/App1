package lesson2.operators.exec1;


import java.io.IOException;
import java.util.Scanner;

public class ElvisOperator {

    public static void main(String[] args) {
        int intA = 12;
        int intB = 14;
        int x;
        int y;
        String ans;
        Scanner input = new Scanner(System.in);

        System.out.println("Proceed?");
        ans = input.nextLine();

        while(ans.equalsIgnoreCase("y")){


        System.out.print("\nx : ");
        x = input.nextInt();

        System.out.print("\ny : " );
        y = input.nextInt();

        if ( x != y ){
            System.out.println("1");
        }
        if( x > y ){
            System.out.println("2");
        }
        if( x%y  == 0){
            System.out.println("3");
        }


        }
        System.out.println("Proceed?");
        ans = input.nextLine();




        

        //int highest = (intA > intB) ? (intA < 15) ? 15 : 20 : intB;

        //System.out.println(highest);
    }
    
}
