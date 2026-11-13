/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowest(TreeNode root , TreeNode p , TreeNode q){

        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowest(root.left , p , q);
        TreeNode right = lowest(root.right , p , q);


       if(left != null && right != null){
        return root ;
       }

        // Otherwise, return the non-null child (or null if both are null)
        return left != null ? left : right;


    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowest(root, p , q);
    }
}