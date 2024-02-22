package lesson11.quiz4.Question52;

class Counter {

    static int ctr = 0;
    int count = 0;
}

public class Test {

    public static void main(String[] args) {
        Counter ctr1 = new Counter();
        Counter ctr2 = new Counter();
        Counter ctr3 = new Counter();

        for (int i = 1; i <= 5; i++) {
            ctr1.ctr++;
            ctr1.count++;
            ctr2.ctr++;
            ctr2.count++;
            ctr3.ctr++;
            ctr3.count++;
        }

        // Printing the values of static and instance variables of ctr3
        System.out.println(ctr3.ctr + " : " + ctr3.count);
    }
}
