import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Solution {
    int count = 0, ans = -1;
    
    public void reverseInorder(Node node, int k) {
        if (node == null || count >= k) return;
        
        reverseInorder(node.right, k);
        count++;
        if (count == k) {
            ans = node.data;
            return;
        }
        reverseInorder(node.left, k);
    }
    
    public int kthLargest(Node root, int k) {
        reverseInorder(root, k);
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create BST
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(8);

        Solution sol = new Solution();
        int k = 2;
        System.out.println("Kth Largest Element ("+k+") : " + sol.kthLargest(root, k));
    }
}
