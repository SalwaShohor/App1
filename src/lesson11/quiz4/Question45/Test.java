package lesson11.quiz4.Question45;

public class Test {

    public static void main(String[] args) {

        try {
            play();
            return;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        } finally {
            System.out.println("MATCH ABANDONED");
        }

        System.out.println("DONE");
    }

    static void play() throws Exception {
        throw new Exception("INJURED");
    }
}

//Output: Compilation Error