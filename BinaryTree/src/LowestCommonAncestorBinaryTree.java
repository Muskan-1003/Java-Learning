public class LowestCommonAncestorBinaryTree {


     public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
     }


        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (p == root || q == root) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            if (right == null) {
                return left;
            } else if (left == null) {
                return right;
            } else {
                return root;
            }

        }

}
