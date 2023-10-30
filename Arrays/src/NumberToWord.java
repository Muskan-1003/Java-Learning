import java.util.Scanner;

public class NumberToWord {
    private static final String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-999): ");
        int number = scanner.nextInt();
        System.out.println("Number in words: " + convertToWords(number));
        scanner.close();
    }

    public static String convertToWords(int number) {
        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 11 + 1];
        } else if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        } else {
            return units[number / 100] + " Hundred " + convertToWords(number % 100);
        }
    }
}