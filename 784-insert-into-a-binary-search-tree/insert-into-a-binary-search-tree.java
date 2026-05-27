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

        TreeNode ans = new TreeNode(val);
        TreeNode head = root ; 

        if(root == null)return ans ; 

        TreeNode temp = root ; 
        TreeNode prev = null;
        char dir = 'l' ; 

        while(root != null){

            if(root.val < val){

                dir = 'r';
                prev = root ; 
                root = root.right ; 

            }

            else{

                dir = 'l' ; 
                prev = root ;
                root = root.left  ;

            }

        }


        if(dir == 'l'){
            prev.left = ans ;
        }
        else{
            prev.right = ans ;
        }

        return head  ; 


        
    }
}