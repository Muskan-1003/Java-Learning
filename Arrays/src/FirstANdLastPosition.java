public class FirstANdLastPosition {//facebook   question

    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.print("[" + result[0] + ",");
        System.out.print(  result[1]+ "]" );



    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                res[0]=mid;//potential value
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
         start = 0;
        end = nums.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                res[1]=mid;//potential value
                start=mid+1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return res;



    }
}