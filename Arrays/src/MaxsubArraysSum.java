public class MaxsubArraysSum {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
      //  MaxsubArraysSum(arr);
        kadanes(arr);
    }

//    public static void  MaxsubArraysSum(int[] arr){
//        int currSum=0;
//        int maxSum=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            int start=i;
//            for (int j = i; j < arr.length; j++) {
//                int end =j;
//                currSum=0;
//                for (int k = start; k <= end; k++) {
//                    currSum += arr[k];
//                }
//                    System.out.println(currSum);
//                    if(maxSum<currSum){
//                        maxSum=currSum;
//                    }
//
//                }
//
//            }
//            System.out.println("maxSum =" + maxSum);
//
//        }



    //optimized version
//    public static void MaxsubArraysSum(int [] arr){
//        int currSum =0;
//        int maxSum=Integer.MIN_VALUE;
//        int prefix[]=new int[arr.length];
//
//        prefix[0]=arr[0];
//        for (int i = 1; i < prefix.length ; i++) {
//            prefix[i]=prefix[i-1]+arr[i];
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//           int start=i;
//            for (int j = i; j <arr.length ; j++) {
//                int end=j;
//                currSum= start==0? prefix[end] : prefix[end]-prefix[start-1];//main line
//
//
//                for (int k = start; k <=end ; k++) {
//                    currSum=currSum+arr[k];//addition
//                }
//                System.out.println(currSum);
//                if(maxSum<currSum){
//                    maxSum=currSum;
//                }
//
//
//            }
//        }
//        System.out.println("maxSum" + maxSum);
//    }
   //kadanes's algorithm--most optimized
    public static void kadanes(int[] arr){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i = 0; i <arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max sum is = " + ms);
    }
}
