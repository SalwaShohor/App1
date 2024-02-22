package lesson11.quiz4.Question36;

public class Aeroplane implements Flyable {
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees."); // Line n3
    }

    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.fly();
        aeroplane.land();
    }
}