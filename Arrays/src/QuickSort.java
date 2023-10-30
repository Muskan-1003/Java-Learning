import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array, and get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays on both sides of the pivot
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the rightmost element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high); // Swap the pivot to its correct position
        return i + 1; // Return the pivot index
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array: " + Arrays.toString(data));

        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(data));
    }
}
