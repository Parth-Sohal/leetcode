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

    public boolean ans(TreeNode root , int targetSum , int currSum){

        if(root == null){
            return false;
        }

        if((root.left == null && root.right == null )&& root.val + currSum == targetSum){
            return true ;
        }

    
        return ans(root.left , targetSum , currSum + root.val) || ans(root.right , targetSum , currSum + root.val);
    }


    public boolean hasPathSum(TreeNode root, int targetSum) {
        return ans(root, targetSum , 0) ;
    }
}