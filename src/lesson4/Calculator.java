package lesson4;

public class Calculator {

    // Scenario a: Add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Scenario b: Add two floating-point numbers
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Scenario c: Find the square of an integer
    public int square(int num) {
        return num * num;
    }

    // Scenario d: Find the square of a floating-point number
    public double square(double num) {
        return num * num;
    }

    // Scenario e: Find the average of three integers
    public double average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Scenario f: Find the average of three floating-point numbers
    public double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Scenario a: Add two integers
        int resultA = calculator.add(3, 5);

        // Scenario b: Add two floating-point numbers
        double resultB = calculator.add(2.5, 3.7);

        // Scenario c: Find the square of an integer
        int resultC = calculator.square(4);

        // Scenario d: Find the square of a floating-point number
        double resultD = calculator.square(3.5);

        // Scenario e: Find the average of three integers
        double resultE = calculator.average(10, 15, 20);

        // Scenario f: Find the average of three floating-point numbers
        double resultF = calculator.average(5.2, 7.8, 6.5);


        // Displaying results
        System.out.println("Result A: " + resultA);
        System.out.println("Result B: " + resultB);
        System.out.println("Result C: " + resultC);
        System.out.println("Result D: " + resultD);
        System.out.println("Result E: " + resultE);
        System.out.println("Result F: " + resultF);
    }
}
