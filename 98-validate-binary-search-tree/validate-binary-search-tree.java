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


    public static boolean validate(TreeNode root , Long[] prev){
        if(root==null){
            return true;
        }

        boolean ans = validate(root.left,prev);

        if((long)root.val <= prev[0]){
            return false;
        }

        if(ans){
            prev[0]=(long)root.val;
            ans = validate(root.right,prev);
        }

        return ans;

    }

    public boolean isValidBST(TreeNode root) {
       
        Long[] prev = new Long[1] ;
        prev[0] = Long.MIN_VALUE;

        return validate(root,prev) ;


    }
}