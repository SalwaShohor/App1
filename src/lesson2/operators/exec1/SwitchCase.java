package lesson2.operators.exec1;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter value : ");
        String str= scanner.nextLine();
        switchCase(str);

        scanner.close();
    }

    static String switchCase(String day){
        String ret = "";
        switch (day){
            case "m": case "mon" : case "md" : 
                if (day.contains("m")){
                    ret = "Monday";
                }
                else ret = "Not  Monday";
                break;
            case "tu":
                ret = "Tuesday";
                break;
            case "we":
                ret = "Wednesday";
                break;
            case "th":
                ret = "Thursday";
                break;
            case "fr":
                ret = "Friday";
                break;
            case "sa":
                ret = "Saturday";
                break;
            case "su":
                ret = "Sunday";
                break;
            default:
                ret = "undefined";
                break;
        

        }

        return ret;

    }


}
