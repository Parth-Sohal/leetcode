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

    static TreeNode prev = null;

    public static void flattenTree(TreeNode root) {

        if (root == null) {
            return;
        }

        if (prev != null) {
            prev.right = root;
        }

        prev = root;

        TreeNode rightTree = root.right;

        flattenTree(root.left);

        root.left = null ;

        flattenTree(rightTree);

    }

    public void flatten(TreeNode root) {

        TreeNode temp =  root ; 

        flattenTree(root) ;

        // return root ; 

    }
}   