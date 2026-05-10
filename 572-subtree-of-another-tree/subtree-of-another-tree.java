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


        return same(a.left , b.left ) && same(a.right , b.right);

    }


    public boolean isSub(TreeNode p , TreeNode q){

        if(p == null){
            return false ; 
        }


        if(same(p,q)){
            return true;
        }

        
            return isSub(p.left , q) || isSub(p.right , q); 
        

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return isSub(root,subRoot) ;
    }
}