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
    public TreeNode insertIntoBST(TreeNode root, int val) {
         TreeNode temp = root ;

        if(root == null){
            return new TreeNode(val) ;
        }

        TreeNode prev = null;
        while(temp != null){

            prev = temp ;

            if(val > temp.val){
                temp = temp.right ;
            }
            else {
                temp = temp.left ;
            }

        }

        if(prev.val > val){
            prev.left = new TreeNode(val);
        }
        else{
            prev.right = new TreeNode(val) ;
        }
        return root ; 

    }
}