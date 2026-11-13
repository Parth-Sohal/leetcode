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

        if(root == null){
            return null;
        }


        if(root.val == p.val || root.val == q.val){
            return root; 
        }


        TreeNode left = lowest(root.left , p , q);
        TreeNode right = lowest(root.right , p , q);


        if(left == null && right == null){
            return null ;
        }

        if(left == null && right != null){
            return right ;
        }

        if(right == null && left != null){
            return left ; 
        }


        if(left.val != right.val){
            return root ;
        }

        return null ;


    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowest(root, p , q);
    }
}