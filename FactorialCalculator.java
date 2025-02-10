public class FactorialCalculator {
    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Factorial of -1: " + factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input number must be non-negative.");
        }
        return (number == 0) ? 1 : number * factorial(number - 1);
    }
}