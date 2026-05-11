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

    public List<List<Integer>> targetSum(TreeNode root,
            List<Integer> list,
            List<List<Integer>> lists,
            int sum,
            int target) {
        if (root == null) {
            return lists;
        }

        list.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum + root.val == target) {
                lists.add(new ArrayList<>(list));
            }
            list.removeLast()  ;
            return lists;

        }

 
        targetSum(root.left, list, lists, sum + root.val, target);
        targetSum(root.right, list, lists, sum + root.val, target);

        list.removeLast() ;

        return lists;

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        return targetSum(root, new ArrayList<>() , new ArrayList<>() , 0 , targetSum); 
    }
}