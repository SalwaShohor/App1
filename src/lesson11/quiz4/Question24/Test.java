package lesson11.quiz4.Question24;


public class Test {
    public static void convert(String s) throws IllegalArgumentException, RuntimeException, Exception {
        if (s.length() == 0) {
            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");
        }
    }

    public static void main(String[] args) {
        try {
            convert("");
        } catch (IllegalArgumentException | RuntimeException | Exception e) { // Line 14
            System.out.println(e.getMessage()); // Line 15
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
