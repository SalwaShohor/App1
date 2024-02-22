package lesson11.quiz4.Question53;

public class Test {

    public static void main(String[] args) {

        try { // outer
            try { // inner
                System.out.println(1 / 0);
            } catch (ArithmeticException e) {
                System.out.println("INNER");
            } finally {
                System.out.println("FINALLY 1");
            }
        } catch (ArithmeticException e) {
            System.out.println("OUTER");
        } finally {
            System.out.println("FINALLY 2");
        }
    }
}
