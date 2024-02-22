package lesson11.quiz4.Question40;

public class Test {

    public static void main(String[] args) {
        String str = "Game on"; // Line n1
        StringBuilder sb = new StringBuilder(str); // Line n2

        System.out.println(str.contentEquals(sb)); // Line n3
        System.out.println(sb.contentEquals(str)); // Line n4
        System.out.println(sb.toString().equals(str)); // Line n5
        System.out.println(str.equals(sb.toString())); // Line n6
    }
}
