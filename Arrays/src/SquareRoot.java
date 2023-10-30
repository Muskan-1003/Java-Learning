import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double sqrt = findSquareRoot(number);
        System.out.println("Square root: " + sqrt);
        scanner.close();
    }

    public static double findSquareRoot(double number) {
        double guess = number / 2.0;
        double epsilon = 1e-15; // A small value for precision
        while (Math.abs(guess * guess - number) > epsilon) {
            guess = (guess + number / guess) / 2.0;
        }
        return guess;
    }
}
