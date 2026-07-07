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

    public static void zizzag(TreeNode root , List<List<Integer>> list , int level){

        if(root == null){
            return ;
        }

        if(level == list.size()){
            list.add(new ArrayList<>());
        }

        if (level % 2 == 0) {
            list.get(level).add(root.val); // Add to the end
        } else {
            list.get(level).add(0, root.val); // Add to the front
        }

        zizzag(root.left, list, level+1);
        zizzag(root.right, list, level+1);

    }

   

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> list =  new ArrayList<>() ; 

        if(root == null){
            return new ArrayList<>() ;
        }

        zizzag(root, list , 0);

        return list ; 
    }
}