import java.util.ArrayList;
import java.util.List;

public class NumberCombinations {

    public static void main(String[] args) {
        int number = 123;
        List<String> combinations = findCombinations(number);
        
        System.out.println("Combinations of " + number + ": " + combinations);
    }

    public static List<String> findCombinations(int number) {
        List<String> result = new ArrayList<>();
        String digits = Integer.toString(number);

        generateCombinations(digits, 0, "", result);

        return result;
    }

    private static void generateCombinations(String digits, int index, String currentCombination, List<String> result) {
        if (index == digits.length()) {
            result.add(currentCombination);
            return;
        }

        char currentDigit = digits.charAt(index);

        // Include the current digit in the combination
        generateCombinations(digits, index + 1, currentCombination + currentDigit, result);

        // Exclude the current digit from the combination
        generateCombinations(digits, index + 1, currentCombination, result);
    }
}
