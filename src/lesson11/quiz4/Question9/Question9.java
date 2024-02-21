package lesson11.quiz4.Question9;

public class Question9 {

    public static void main(String[] args) {
        for (int x = 10, y = 11, z = 12; y > x && z > y; y -= 2) {
            System.out.println(x + y + z);
        }
    }
    
}
