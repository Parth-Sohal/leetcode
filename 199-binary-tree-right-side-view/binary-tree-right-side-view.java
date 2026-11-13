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

    public void rightDFs(TreeNode root , List<Integer> list, int depth){

        if(root == null){
            return ; 
        }

        if(list.size() < depth){
            list.add(root.val);
        }


        rightDFs(root.right,list , depth+1);
        rightDFs(root.left,list , depth+1);


    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        rightDFs(root, list , 1);


        return list ; 

    }
}