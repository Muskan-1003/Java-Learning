public class MaxMinValue {
    public static void main(String[] args) {
        int[] a = {35, 78, 94, 66, 90};
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

            System.out.println("max value is=" + max);
                   }
    }
}
