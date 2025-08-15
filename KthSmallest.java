class Solution {
    int count = 0;  // keeps track of visited nodes
    int ans = -1;   // stores answer

    // Inorder Traversal: L → N → R (gives ascending order for BST)
    void inorder(Node root, int k) {
        if (root == null || count >= k) return;

        inorder(root.left, k);    // go left
        count++;                  // visit current node
        if (count == k) {         // found Kth smallest
            ans = root.data;
            return;
        }
        inorder(root.right, k);   // go right
    }

    public int KthSmallestElement(Node root, int K) {
        count = 0;
        ans = -1;
        inorder(root, K);
        return ans;
    }
}
