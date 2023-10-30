public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,11,22,33,44,65,86,99};
        int target=33;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{//element found
                return mid;
            }
        }
        return -1;
    }
}
