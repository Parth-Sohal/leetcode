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

    public int  goodNode(TreeNode root, int max) {

        if (root == null) {
            return 0;
        }

        int count = 0 ; 
        if (root.val >= max) {
            count++;
            max = root.val;
        }

        return goodNode(root.left, max) + goodNode(root.right, max) + count ;

    }

    public int goodNodes(TreeNode root) {

        return goodNode( root , Integer.MIN_VALUE ) ;

    }
}