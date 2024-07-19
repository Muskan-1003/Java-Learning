public class QuickSort {
    public static void main(String[] args) {

    }
    static  void sort(int[] nums, int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e =hi;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        while(s<=e){
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
//now pivot is at correct position
    }


//this is good
    class Solution {
        // Function to sort an array using the quick sort algorithm.
        static void quickSort(int arr[], int low, int high) {
            if (low < high) {
                int p = partition(arr, low, high);
                quickSort(arr, low, p - 1);
                quickSort(arr, p + 1, high);
            }
        }

        static int partition(int arr[], int low, int high) {
            int pivot = arr[low];  // Choosing the pivot element
            int i = low + 1;
            int j = high;

            while (i <= j) {
                while (i <= high && arr[i] <= pivot) {
                    i++;
                }
                while (j >= low && arr[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    swap(arr, i, j);
                }
            }
            swap(arr, low, j);  // Place the pivot element in its correct position
            return j;
        }

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
