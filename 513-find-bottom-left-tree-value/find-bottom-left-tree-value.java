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

    public static void bottomLeftTree(TreeNode root , int[][] maxSoFar , int row) {

        if(root == null)return ;

        if(maxSoFar[0][0] < row){
            maxSoFar[0][0] = row;
            maxSoFar[0][1] = root.val;
        }


        bottomLeftTree(root.left,maxSoFar,row+1);
        bottomLeftTree(root.right,maxSoFar,row+1);

    }

    public int findBottomLeftValue(TreeNode root) {
        
        int[][] arr = {{-1,-1}};
        bottomLeftTree(root,arr,0);

        return arr[0][1] ;

    }
}