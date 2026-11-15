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

    // inorder of a bst is sorted

    private int count = 0;
    private int ans = -1;

    public void kth(TreeNode root , int k){

        if(root == null || count >= k){
            return ;
        }


        kth(root.left , k);

        count++;
        if(count == k){
           ans = root.val ;
            return ; 
        }


    
        kth(root.right, k);
        
    }

    public int kthSmallest(TreeNode root, int k) {
        kth(root, k);
        return ans ; 
    }
}