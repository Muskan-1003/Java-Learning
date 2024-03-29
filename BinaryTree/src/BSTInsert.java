public class BSTInsert {

    public class Node {
        private int value;
        private int height;

        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int getHeight() {
            return height;
        }
    }

    private Node root;

    public void BST() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public  void insert (int value){

    }

    private Node insert(int value,Node node){
        if(node==null){
            node= new Node(value);
            return node;
        }
        if(value< node.value){
            node.left=insert(value,node.left);
        }

        if(value> node.value){
            node.right=insert(value,node.right);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;

    }
public void preOrder(){
        preOrder(root);
}
    public void preOrder(Node node){
       if(node==null){
           return;
       }
        System.out.println(node.value+" ");
       preOrder(node.left);
       preOrder(node.right);

    }



    public void inOrder(){
        inOrder(root);
    }
 public void inOrder(Node node){
       if(node==null){
           return;
       }
     inOrder(node.left);
        System.out.println(node.value+" ");

       inOrder(node.right);

    }

    public void postOrder(){
        postOrder(root);
    }
 public void postOrder(Node node){
       if(node==null){
           return;
       }
     postOrder(node.left);

     postOrder(node.right);
        System.out.println(node.value+" ");



    }


}


