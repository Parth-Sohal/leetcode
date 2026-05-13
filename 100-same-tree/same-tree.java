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

    public static boolean same(TreeNode a , TreeNode b){


        if(a == null || b == null){
            return a == b ;
        }


        if(a.val != b.val){
            return false ;
        }


        return same(a.left , b.left) && same(a.right,b.right);


    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);
    }
}