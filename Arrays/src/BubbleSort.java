import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped =false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr [j+1]=temp;
                    swapped=true;

                }


            }
            if (swapped==false){
                break;
            }

        }
    }
}
