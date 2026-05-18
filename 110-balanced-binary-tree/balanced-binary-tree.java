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

    public static int balanced(TreeNode root , boolean[] ans){

        if(root == null){
            return 0 ;
        }

        int left = 1 + balanced(root.left,ans);
        int right = 1 + balanced(root.right,ans);

        if(Math.abs(left-right) > 1){
            ans[0] = false ;
        }

        return Math.max(left, right);

    }

    public boolean isBalanced(TreeNode root) {

        boolean[] ans = new boolean[1];
        ans[0] = true;

        balanced(root,ans) ;

        return ans[0] ;
    }
}