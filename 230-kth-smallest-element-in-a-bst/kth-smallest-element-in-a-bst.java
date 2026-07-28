/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int count = 0;
    private int ans = -1;

    private void kthSmallest1(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        kthSmallest1(root.left, k);
        count++;

        if (count == k) {
            ans = root.val;
            return;
        }

        kthSmallest1(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        kthSmallest1(root, k) ;

        return ans ; 
    }
}