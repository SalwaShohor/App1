package lesson11.quiz4.Question55;

class Super {
    Super() {
        System.out.print("Reach");
    }
}

class Sub extends Super {
    Sub() {
        Super(); 
        System.out.print("out");
    }
}

public class Test {
    public static void main(String[] args) {
        new Sub();
    }
}
