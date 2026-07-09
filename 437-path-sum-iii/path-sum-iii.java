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

    public  long sumIII(TreeNode root , long currSum , long target){


        if(root == null){
            return 0;
        }

        long ans = 0 ;
        if(currSum + root.val == target){
            ans += 1 ;
        }

        return ans + sumIII(root.left , currSum + root.val ,  target) + sumIII(root.right, currSum + root.val, target);

    }


    public  long pathSumIII(TreeNode root , long target){

        if(root == null){
            return 0 ;
        }

        long ans = sumIII(root , 0 , target);

        return pathSumIII(root.left , target) + pathSumIII(root.right , target) + ans ;

    }

    public int pathSum(TreeNode root, int targetSum) {
        return (int)pathSumIII(root, (long)targetSum) ; 
    }
}