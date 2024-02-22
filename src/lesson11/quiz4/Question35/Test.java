package lesson11.quiz4.Question35;



public class Test {
    public static void main(String[] args) {
        byte b1 = 10; // Line n1
        int i1 = b1; // Line n2
        byte b2 = i1; // Line n3
        //byte b2 = (byte) i1; // Line n3

        System.out.println(b1 + i1 + b2);
    }
}
