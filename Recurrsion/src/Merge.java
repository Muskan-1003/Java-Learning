//import java.util.Arrays;
//
//public class Merge {//nlogn
//    public static void main(String[] args) {
//        int[] arr={1,2,4,3,5,6};
//        arr=mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }
////    static int[] mergeSort(int[] arr){//int[] because we want to retrurn an array
////        if(arr.length==1){//base
////            return arr;
////        }
////        int mid= arr.length/2;
////        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
////        int[] right=mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
////
////        return merge(left,right);
////
////    }
////
////    private static int[] merge(int[] first,int[] second){
////        int[] mix=new int[first.length+second.length];
////
////        int i=0;
////        int j=0;
////        int k=0;
////
////        while(i< first.length && j< second.length){
////            if(first[i]<second[j]){
////                mix[k]=first[i];
////                i++;
////            } else{
////                mix[k]=second[j];
////                j++;
////            }
////            k++;
////        }
////        //it may possible that one array is not complete
////        while (i< first.length){
////            mix[k]=first[i];
////            i++;
////            k++;
////        }
////        while (j< second.length){
////            mix[k]=second[j];
////            j++;
////            k++;
////        }
////        return mix;
////    }
//
//
//
////this is more better way
//    void merge(int arr[], int l, int m, int r) {
//        // Create temp arrays
//        int[] L = Arrays.copyOfRange(arr, l, m + 1);
//        int[] R = Arrays.copyOfRange(arr, m + 1, r + 1);
//
//        // Initial indexes of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < L.length && j < R.length) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            } else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements of L[] if any
//        while (i < L.length) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements of R[] if any
//        while (j < R.length) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    // Main function that sorts arr[l..r] using merge()
//    void mergeSort(int arr[], int l, int r) {
//        if (l < r) {
//            // Find the middle point
//            int m = l + (r - l) / 2;
//
//            // Sort first and second halves
//            mergeSort(arr, l, m);
//            mergeSort(arr, m + 1, r);
//
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//        }
//    }
//
//}
