package lesson11.quiz4.Question19;


interface M {
    static void log() {
        System.out.println("M");
    }
}

abstract class A {
    static void log() {
        System.out.println("N");
    }
}

class MyClass extends A implements M {
}

public class Question19 {
    public static void main(String[] args) {
        M obj1 = new MyClass();
        obj1.log(); // Line n1

        A obj2 = new MyClass();
        obj2.log(); // Line n2

        MyClass obj3 = new MyClass();
        obj3.log(); // Line n3
    }
}
