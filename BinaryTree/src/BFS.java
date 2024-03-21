import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFS {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class BSF {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList<>(levelSize);
                for (int i = 0; i < levelSize; i++) {
                    TreeNode currentNode = queue.poll();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                result.add(currentLevel);
            }
            return result;
        }


        /**
         * Definition for a binary tree node.
         * public class TreeNode {
         * int val;
         * TreeNode left;
         * TreeNode right;
         * TreeNode() {}
         * TreeNode(int val) { this.val = val; }
         * TreeNode(int val, TreeNode left, TreeNode right) {
         * this.val = val;
         * this.left = left;
         * this.right = right;
         * }
         * }
         */
        class Solution {
            public List<Double> averageOfLevels(TreeNode root) {
                List<Double> result = new ArrayList<>();
                if (root == null) {
                    return result;
                }

                Queue<TreeNode> queue = new LinkedList<>();
                queue.offer(root);

                while (!queue.isEmpty()) {
                    int levelSize = queue.size();
                    double average = 0;
                    for (int i = 0; i < levelSize; i++) {
                        TreeNode currentNode = queue.poll();

                        average += currentNode.val;// addition of all

                        if (currentNode.left != null) {
                            queue.offer(currentNode.left);
                        }
                        if (currentNode.right != null) {
                            queue.offer(currentNode.right);
                        }
                    }
                    average = average / levelSize;
                    result.add(average);
                }
                return result;
            }
        }

    }

}