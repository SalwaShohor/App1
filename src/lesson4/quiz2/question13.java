package lesson4.quiz2;
import java.io.FileNotFoundException;
import java.io.IOException;

public class question13{

    abstract class Super{
        public abstract void m1() throws IOException;
    }

    class Sub extends Super{
        @Override
        public void m1() throws IOException{
            throw new FileNotFoundException();
        }
    }

    public class Test{
        public static void main(String[] args){
            Super s = new Sub();

            try{
                s.m1();
            } catch (IOException e) {
                System.out.print("A");
            } catch (FileNotFoundException e){
                System.out.print("B");
            } fiinally {
                System.out.print("C");
            }
        }}
}


