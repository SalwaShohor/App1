package lesson11.quiz4.Question42;

class Base {
    public void log() throws NullPointerException {
        System.out.println("Base: log()");
    }
}

class Derived extends Base {
    public void log() throws RuntimeException {
        System.out.println("Derived: log()");
    }
}

public class Test {
    public static void main(String[] args) {
        Base obj = new Derived();

        obj.log();

    }
}
