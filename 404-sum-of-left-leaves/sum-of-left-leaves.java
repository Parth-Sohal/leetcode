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

    public static int leftSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int sum = 0 ;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sum += leftSum(root.left);
        sum += leftSum(root.right);

        return sum ; 
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return leftSum(root);
    }
}