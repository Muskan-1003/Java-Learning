import java.util.ArrayList;
import java.util.List;

public class SubsetIterative {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());//an empty list is added

        for (int num: arr) {
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
            
        }



        return outer;
    }

    //recurrsively

    //2^N -->tc
    class Solution {
        public List<List<Integer>> subsets(int[] arr) {
            //recurssively
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> subset = new ArrayList<>();

            sub(arr, 0, res, subset);
            return res;

        }
        private void sub(int[] arr,int index,List<List<Integer>> res,List<Integer> subset ){
            if(index==arr.length){
                res.add(new ArrayList<>(subset));
                return;
            }
            subset.add(arr[index]);
            sub(arr,index+1,res,subset);//accept

            subset.remove(subset.size()-1);
            sub(arr,index+1,res,subset);//reject
        }


    }

}
