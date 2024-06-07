public class Diameter {
    public class TreeNode {
        int val;
        LowestCommonAncestorBinaryTree.TreeNode left;
        LowestCommonAncestorBinaryTree.TreeNode right;
        TreeNode(int x) { val = x; }
    }

        int diameter = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return diameter - 1;
        }

        int height(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            int dia = leftHeight + rightHeight + 1;
            diameter = Math.max(diameter, dia) ;

            return Math.max(leftHeight, rightHeight) + 1;


    }
}
