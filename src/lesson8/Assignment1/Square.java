package lesson8.Assignment1;

// Square.java
public class Square extends Rectangle {
    private double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ", side=" + side + "]";
    }
}
