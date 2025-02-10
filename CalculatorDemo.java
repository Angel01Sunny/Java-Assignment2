@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.compute(5, 3));

        // Lambda expression for subtraction
        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.compute(5, 3));

        // Lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.compute(5, 3));
    }
}