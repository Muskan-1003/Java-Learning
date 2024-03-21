import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    public class TreeNode {
        int val;
        BFS.TreeNode left;
        BFS.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, BFS.TreeNode left, BFS.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public int maxLevelSum(TreeNode root) {
            if (root == null) {
                return 0; // Return 0 if the tree is empty
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int maxLevelSum = Integer.MIN_VALUE; // Initialize maxLevelSum with the minimum integer value
            int maxLevel = 0;
            int level = 0;

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                int levelSum = 0; // Initialize the sum for the current level

                for (int i = 0; i < levelSize; i++) {
                    TreeNode currentNode = queue.poll();
                    levelSum += currentNode.val;

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }

                // Update maxLevelSum and maxLevel if the sum of the current level is greater
                if (levelSum > maxLevelSum) {
                    maxLevelSum = levelSum;
                    maxLevel = level + 1; // Since levels start from 1
                }

                level++;
            }

            return maxLevel;
        }
    }
}
