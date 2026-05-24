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

    public static int longestUniValue(TreeNode root , int[] max){

        if(root == null){ // null 
            return 0 ;
        }
        

        int left = longestUniValue(root.left,max);
        int right = longestUniValue(root.right,max);

        int leftPath = 0 ;
        int rightPath = 0 ; 
        
        int val = root.val;
        
       
        if(root.left != null && root.left.val == val){
            leftPath =  left + 1;
        }

        
        if(root.right != null && root.right.val == val){
            rightPath = right + 1;
        }

        max[0] = Math.max(max[0] , leftPath + rightPath) ;
        
        return Math.max(leftPath , rightPath) ;
        
    }

    public int longestUnivaluePath(TreeNode root) {


        int[] max = new int[1];
        // max[0] = INTEGER.MIN_VALUE ; 

        longestUniValue(root , max) ;

        return max[0] ; 

    
        
    }
}