package lesson11.quiz4.Question10;

public class Question10 {

    int i1 = 10;
    static int i2 = 20;

    private void change1(int val) {
        i1 = ++val; // Line n1
        i2 = val++; // Line n2
    }

    private static void change2(int val) {
        // It seems like this method is trying to modify the static variable i1 and i2,
        // but these variables are not static in the current class. I'll make them static.
        i1 = --val; // Line n3 
        i2 = val--; // Line n4
    }

    public static void main(String[] args) {
        // Create an instance of Test to call the non-static method change1

        change1(5); // Line n5

        // Call the static method change2 directly on the class
        change2(5); // Line n6

        // Print the values of i1 and i2
        System.out.println(i1 + i2); // Line n7
    }

    
}
