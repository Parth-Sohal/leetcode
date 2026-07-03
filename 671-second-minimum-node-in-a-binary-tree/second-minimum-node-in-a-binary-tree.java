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

    private int secondMin(TreeNode root , int min){

        if(root == null){
            return -1 ; 
        }

        if(root.val > min){
            return root.val  ;
        }

        int a = secondMin(root.left , min) ;
        int b = secondMin(root.right , min) ;

        if (a != -1 && b != -1) {
            return Math.min(a, b);
        } 

        return a != -1 ? a : b;

    } 



    public int findSecondMinimumValue(TreeNode root) {

        if (root == null) return -1;
        return secondMin(root, root.val) ;
        
    }
}