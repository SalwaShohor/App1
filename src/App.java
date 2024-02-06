import lesson1.*;

public class App {
    public static void main (String[] args) {
        lesson3();

    }

    public static void lesson3(){
        int numberOfVessels = 17;
        int[] dimension = {5,7,9};
        SecondIntegerHandler integerHandler = new SecondIntegerHandler(numberOfVessels, dimension);
        int volume = integerHandler.getTotalVolume();
        String msg = integerHandler.toString();
        System.out.println(msg);
        System.out.println(volume);
    }

    public static void lesson2(){
        int numberOfVessels = 15;
        int[] dimension = {2,4,7};
        IntegerHandler integerHandler = new IntegerHandler(numberOfVessels, dimension);
        int volume = integerHandler.getTotalVolume();
        String msg = integerHandler.toString();
        System.out.println(msg);
        System.out.println(volume);
    }

    public static void lesson1(){
        StringHandler stringHandler = new StringHandler("my class");
        System.out.println(stringHandler.toString());
        stringHandler.setStr("my new Class");
        System.out.println(stringHandler.toString());
        
    }
}

