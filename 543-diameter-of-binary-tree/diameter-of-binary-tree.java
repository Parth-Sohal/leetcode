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

    static int max = 0 ;


    public static int diameter(TreeNode root){
        if(root == null)return 0 ;

        int left = diameter(root.left) ;
        int right = diameter(root.right) ;

        max = Math.max(max , left + right) ;
        return Math.max(left,right)+1;

    }

    public int diameterOfBinaryTree(TreeNode root) {
        
        max = 0 ; 

        diameter(root);

        return max ; 

    }
}