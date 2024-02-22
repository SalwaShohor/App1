package lesson11.quiz4.Question43.Question44;

class Super {
    public String num = "10"; // Line n1
}

class Sub extends Super {
    protected int num = 20; // Line n2
}

public class Test {
    public static void main(String[] args) {
        Super obj = new Sub();
        System.out.println(obj.num += 2); // Line n3
    }
}
