import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = bitCounter(i);
        }

        return result;
    }

    public static int bitCounter(int n) {
        int count = 0;

        while (n > 0) {
            count += n & 1;  // Check the rightmost bit
            n >>= 1;        // Shift right
        }

        return count;
    }
}
