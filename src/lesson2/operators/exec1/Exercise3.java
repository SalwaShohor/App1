package lesson2.operators.exec1;

public class Exercise3 {

    public static void main(String[] args){
        String str = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(str);
        System.out.println(str.concat(str));
        str = str.concat(str);
        System.out.println(str);

        System.out.println(str.charAt(9));
        System.out.println(str.length());
        // if(str.contains("qwerty")){
        //     System.out.println("Contains qwerty");
        // }
        // else{
        //     System.out.println("Does not contain qwerty");
        // }

        if(str.contains("qwerty")){
            System.out.printf("Contains %s", "qwerty");
        }
        else{
            System.out.printf("Does not contain %s", "qwerty");
        }
    }
    
}
