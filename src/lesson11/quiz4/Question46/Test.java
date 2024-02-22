package lesson11.quiz4.Question46;
import java.util.List;

class A {}

class B extends A {}

abstract class Super {
    abstract List<A> get() throws IndexOutOfBoundsException;
}

abstract class Sub extends Super {
    //abstract ArrayList<B> get();
    abstract List<A> get() throws ArrayIndexOutOfBoundsException;
    //abstract ArrayList<A> get() throws Exception;
    //abstract List<B> get();


}
