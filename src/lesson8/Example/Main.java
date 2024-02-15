package lesson8.Example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.9);
        int border = circle.border();
        double area = circle.calculateArea();
        double peri = circle.calculatePerimeter();
        System.out.printf("Border: %f, Area: %f, Perimeter: %f", border, area, peri);
        Rectangle rectangle = new Rectangle(5.0,7.0);
        border = rectangle.border();
        area = rectangle.calculateArea();

        
    }
    
    
}
