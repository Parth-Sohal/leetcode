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

    public boolean isSameTree2(TreeNode p, TreeNode q) {

        if(p == null || q == null){
            return p == q ; 
        }
        
        if(p.val != q.val){
            return false;
        }
        
        return isSameTree2(p.left, q.left) && isSameTree2(p.right, q.right);
        
        
        
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameTree2(p,q);
    }
}