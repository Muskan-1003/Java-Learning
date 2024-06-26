public class ConvertSortedArraytoBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }

            return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
        }

        private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }

            int mid = start + (end - start) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBSTHelper(nums, start, mid - 1);
            root.right = sortedArrayToBSTHelper(nums, mid + 1, end);

            return root;
        }
    }

}
