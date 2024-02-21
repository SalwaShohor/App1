package lesson11.quiz4.Question13;

interface Rideable {
    void ride(String name);
}

class Animal {}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

public class Question13 {
    public static void main(String[] args) {
        Animal horse = new Horse();
        ((Horse)horse).ride("Emma");
        ((Rideable)horse).ride("emma");
        ((Rideable)(Horse)horse).ride("EMMA");
        ((Horse)(Rideable)horse).ride("emma");

    }
}
