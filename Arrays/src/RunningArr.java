
public class RunningArr {

        public static void  main(String[] args){
            int[] nums ={1,2,3,4};
            int[] results=rev(nums);
            for (int i = 0; i < results.length; i++) {
                System.out.print(results[i] + " ");

            }



        }
        public static int[] rev(int[] nums){
            int sum =0;
            int[] newArr=new int[nums.length];
            for(int i=0;i<nums.length; i++){
                sum =sum+nums[i];
                newArr[i]=sum;
            }
            return newArr;
        }
    }

