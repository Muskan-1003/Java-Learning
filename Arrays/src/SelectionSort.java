import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }

            }
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
    }
}
