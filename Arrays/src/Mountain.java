public class Mountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2,1};
        int ans=MountainPeakIndex(arr);
        System.out.println("The mountain index is : "+ ans);
    }
    public static int MountainPeakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return end;
    }

}
