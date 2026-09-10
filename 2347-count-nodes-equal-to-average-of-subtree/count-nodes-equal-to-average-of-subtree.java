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

    private int ans = 0 ; 

    public int[] average(TreeNode root){

       if(root == null){
            return new int[2];
       }

       int[] left = average(root.left );
       int[] right = average(root.right);

       int totalSum = left[0] + right[0] + root.val ;
       int count = left[1] + right[1] + 1 ;

       int avg = (totalSum) / (count) ;

       if(avg == root.val){
        this.ans++;
       }

       return new int[]{totalSum , count};

    }

    public int averageOfSubtree(TreeNode root) {
        
        if(root == null)return 0 ; 

        average(root);

        return this.ans ; 


    }
}