import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class rightLeftBSF {
    class Node
    {
        int data;
        Node left, right;
        Node(int key)
        {
            data = key;
            left = right = null;
        }
    }
    class Tree {
        public static void printCorner(Node node) {
            if (node == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.offer(node);

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                ArrayList<Integer> leftCorner = new ArrayList<>();
                ArrayList<Integer> rightCorner = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    Node currentNode = queue.poll();

                    if (levelSize == 1) {
                        leftCorner.add(currentNode.data);
                    } else {
                        if (i == 0) {
                            leftCorner.add(currentNode.data);
                        }
                        if (i == levelSize - 1) {
                            rightCorner.add(currentNode.data);
                        }
                    }


                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                for (int data : leftCorner) {
                    System.out.print(data + " ");
                }
                for (int data : rightCorner) {
                    System.out.print(data + " ");
                }

            }
        }
    }
}
