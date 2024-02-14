package lesson4.quiz2.question28;

public class TestA {
    public static void main(String[] args){
        A obj = new A(); //Line 7
        System.out.println(obj.i1); //Line 8
        System.out.println(obj.i2); //Line 9
        System.out.println(obj.i3); //Line 10
        System.out.println(obj.i4); //Line 11

        //Correct Answer
        //Line 10 causes compilation error
        //Line 11 causes compilation error
        //Line 9 causes compilation error

        //Line 11-private members are only accessible within the class they 
        //are declared in. Attempting to access a private member from 
        //another class will result in a compilation error.

    }

}
