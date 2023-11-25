import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=4;
        System.out.println(LS(arr, target,0));

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


}
