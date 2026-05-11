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

    public static int minDep(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return minDep(root.right) + 1;
        }


        if(root.right == null) {
            return minDep(root.left) + 1;
        }


        return Math.min(minDep(root.left) , minDep(root.right) ) + 1;



    }

    // 2. If right is null, we must go left

    public int minDepth(TreeNode root) {

        return minDep(root);

    }

}