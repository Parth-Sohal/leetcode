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

    private int max = 0 ; 

    public int longValue(TreeNode root) {

        if(root == null){
            return 0 ; 
        }

        int left = longValue(root.left) ;
        int right = longValue(root.right) ; 

        if(root.left == null || root.left.val != root.val){
            left = 0 ;
        } 
        else{
            left = left + 1; 
        }

        if(root.right == null || root.right.val != root.val){
            right = 0 ;
        } 
        else{
            right = right + 1 ;
        }

        max = Math.max(max , left + right) ;
        return Math.max(left , right)  ;

    } 


    public int longestUnivaluePath(TreeNode root) {
        longValue(root) ;
        return max ;
    }
}