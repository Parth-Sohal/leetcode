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

    public int isBalanced1(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = isBalanced1(root.left);

        if (left == -1) {
            return -1;
        }

        int right = isBalanced1(root.right);

        if(right == -1)return -1 ; 


        if (Math.abs(right - left) > 1) {
            
            return -1;
        }

        return Math.max(left, right) + 1;

    }

    public boolean isBalanced(TreeNode root) {
         
         int ans = isBalanced1(root);
        
        // Since any imbalance bubbles up as -1, 
        // if ans is NOT -1, the tree is perfectly balanced!
        return ans != -1;

    }
}