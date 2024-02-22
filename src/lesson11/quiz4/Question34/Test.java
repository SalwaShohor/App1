package lesson11.quiz4.Question34;



import java.io.FileNotFoundException;
import java.io.IOException;

class Base {
    Base() throws IOException {
        System.out.print(1);
    }
}

class Derived extends Base {
    Derived() throws FileNotFoundException {
        System.out.print(2);
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        new Derived();
    }
}
