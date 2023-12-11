import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutationList(new ArrayList<>(), nums, result);
        return result;
    }

    static void permutationList(ArrayList<Integer> p, int[] up, List<List<Integer>> ans) {
        if (up.length == 0) {
            ans.add(new ArrayList<>(p));
            return;
        }

        int ch = up[0];

        for (int i = 0; i <= p.size(); i++) {
            ArrayList<Integer> f = new ArrayList<>(p.subList(0, i));
            f.add(ch);
            f.addAll(p.subList(i, p.size()));
            permutationList(f, removeElementAtIndex(up, 0), ans);
        }
    }

    static int[] removeElementAtIndex(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        int newArrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[newArrIndex++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.permute(nums);
        System.out.println(result);
    }
}
