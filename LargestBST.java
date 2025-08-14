class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Info {
    boolean isBST;
    int size, min, max;
    Info(boolean isBST, int size, int min, int max) {
        this.isBST = isBST;
        this.size = size;
        this.min = min;
        this.max = max;
    }
}

public class LargestBST {
    static int maxSize = 0;

    static Info largestBST(Node root) {
        // Base case: empty tree is BST
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // Check if current subtree is BST
        if (leftInfo.isBST && rightInfo.isBST &&
            root.data > leftInfo.max && root.data < rightInfo.min) {
            
            int currSize = leftInfo.size + rightInfo.size + 1;
            maxSize = Math.max(maxSize, currSize);
            
            return new Info(true, currSize,
                    Math.min(root.data, leftInfo.min),
                    Math.max(root.data, rightInfo.max));
        }

        // Not a BST
        return new Info(false, Math.max(leftInfo.size, rightInfo.size), 0, 0);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);
        System.out.println("Size of Largest BST is: " + maxSize);
    }
}
