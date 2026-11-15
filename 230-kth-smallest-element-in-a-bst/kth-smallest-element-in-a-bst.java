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

    private int count = 0 ; 

    public TreeNode kth(TreeNode root , int k){

        if(root == null){
            return null;
        }


        TreeNode ans = kth(root.left , k);

        count++;
        if(count == k){
            return root;
        }


        if(ans == null){
            ans = kth(root.right, k);
        }


        return ans ; 
        
    }
    
    
    public int kthSmallest(TreeNode root, int k) {
        return kth(root, k).val ; 
    }
}