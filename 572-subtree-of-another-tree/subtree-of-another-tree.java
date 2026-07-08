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

    public boolean isSys(TreeNode p , TreeNode q){

        if(p == null || q == null){
            return p == q;
        }


        if(p.val != q.val){
            return false; 
        }

        return isSys(p.right , q.right) && isSys(p.left , q.left);


    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null || subRoot == null)return root == subRoot ;

        
        if(isSys(root, subRoot)){
            return true ; 
        }        

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot) ; 


    }
}