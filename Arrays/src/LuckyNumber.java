import java.util.HashSet;
import java.util.Set;

public class LuckyNumber {

    public static void main(String[] args) {
        long number = 975L; // Use long instead of int
        int result = isLucky(number);

        System.out.println(result);
    }

    public static int isLucky(long number) {
        String numStr = Long.toString(number); // Use Long.toString for long
        Set<Long> digitProducts = new HashSet<>();

        for (int i = 0; i < numStr.length(); i++) {
            long product = 1;

            for (int j = i; j < numStr.length(); j++) {
                long digit = numStr.charAt(j) - '0';

                // Check if the digit product is already present
                if (digitProducts.contains(product * digit)) {
                    return 0; // Not lucky
                }

                product *= digit;
                digitProducts.add(product);
            }
        }

        return 1; // Lucky
    }
}
