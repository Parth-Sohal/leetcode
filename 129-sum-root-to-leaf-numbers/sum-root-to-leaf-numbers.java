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


    public static int sumRoot(TreeNode root , int sum ){


        if(root == null){
            return 0 ;
        }

        if(root.left == null && root.right == null){
            return sum*10 + root.val ;
        }


        return sumRoot(root.left,sum*10+root.val) + sumRoot(root.right,sum*10 + root.val);

    }

    public int sumNumbers(TreeNode root) {
        return sumRoot(root,0);
    }
}