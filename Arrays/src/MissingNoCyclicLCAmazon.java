import java.util.Arrays;

public class MissingNoCyclicLCAmazon {
    public static void main(String[] args) {
        int[] arr={1,4,2,0};
        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //search for missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index){
                return index;
            }
            
        }
        //case2
        return arr.length;

    }
    private static void swap(int[] arr, int first ,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
