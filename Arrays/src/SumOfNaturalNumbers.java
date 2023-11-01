import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = findSumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        scanner.close();
    }

    // Function to find the sum of the first n natural numbers
    public static int findSumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}
