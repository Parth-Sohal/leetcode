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

    public void path(TreeNode root, List<Integer> list, List<List<Integer>> lists,
           int target, int currSum) {


            if(root == null){
                return ;
            }

            if(root.left  == null && root.right == null) {

                if(currSum + root.val == target){
                    list.add(root.val);
                    lists.add(new ArrayList<>(list));
                    list.removeLast();
                }

                return ; 
            }

            list.add(root.val);
            path(root.left , list,lists, target, (currSum + root.val));
            path(root.right , list,lists, target, (currSum + root.val));
            list.removeLast() ;
    
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();

        path(root, new ArrayList<>() , ans , targetSum , 0);


        return ans ; 
        
    }
}