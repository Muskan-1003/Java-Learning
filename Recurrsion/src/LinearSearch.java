import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=4;
        System.out.println(LS(arr, target,0));
        System.out.println(findAllIndex2(arr,target,0));

    }
    static boolean LS(int[] arr, int target, int index){
        if(index== arr.length){
            return false;
        }
        return (arr[index]==target || LS(arr,target,index+1));
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static  void  findAllIndex(int[] arr, int target,int index){
        if(index== arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
   static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
       if(index== arr.length){
           return list;
       }
       if(arr[index]==target){
           list.add(index);
       }
       ArrayList<Integer> ansFrombelowCalls=findAllIndex2(arr,target,index+1);
       list.addAll(ansFrombelowCalls);
       return list;

   }

}
