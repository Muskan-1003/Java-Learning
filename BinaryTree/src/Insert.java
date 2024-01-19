import java.util.Scanner;

public class Insert {
private static class Node{
    int value;
    Node left;
    Node right;
    public  Node(int value){
        this.value=value;
    }
}
private Node root;

//insert element
public void populate(Scanner scanner) {
    System.out.println("Enter the root node: ");
    int value = scanner.nextInt();
    root = new Node(value);
    // recursion to add other nodes
    populate(scanner, root);
}

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        String leftInput = scanner.next();  // Read input as a string
        boolean left = Boolean.parseBoolean(leftInput);  // Parse string to boolean
        if (left) {
            System.out.println("Enter the value of left " + node.value);
            int leftValue = scanner.nextInt();
            node.left = new Node(leftValue);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        String rightInput = scanner.next();  // Read input as a string
        boolean right = Boolean.parseBoolean(rightInput);  // Parse string to boolean
        if (right) {
            System.out.println("Enter the value of right " + node.value);
            int rightValue = scanner.nextInt();
            node.right = new Node(rightValue);
            populate(scanner, node.right);
        }
    }


  public  void  display(){
        display(this.root, "");

  }

  private void  display(Node node,String indent){
        if(node==null){
            return;
        }
      System.out.println(indent+ node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
  }


}
