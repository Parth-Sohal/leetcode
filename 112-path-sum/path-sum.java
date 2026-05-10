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

    public boolean sum(TreeNode root, int sum, int target) {

        if (root == null) {
            return false;
        }


        if (root.left == null && root.right == null) {
            return (sum + root.val) == target;
        }

    
        return sum(root.left, sum + root.val, target) || sum(root.right, sum + root.val, target);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return sum(root, 0, targetSum);
    }
}