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

    public List<List<Integer>>  sum(
        TreeNode root , 
        int sum , 
        List<Integer> list ,
        int targetSum ,
        List<List<Integer>> ans 
    ){
        if(root == null){
            return ans ; 
        }

        if(root.left == null && root.right == null){
            // System.out.println(list + " " + sum);
            if(sum+root.val == targetSum){
                list.add(root.val);
                ans.add(new ArrayList<>(list));
                list.removeLast() ;
            }

            return ans ; 
        }

        list.add(root.val);
        sum(root.left , sum + root.val , list , targetSum , ans);
        sum(root.right , sum + root.val , list , targetSum , ans);

        list.removeLast() ;

        return ans ; 

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        return sum(root  , 0, new ArrayList<>() , targetSum , new ArrayList<>());
    
    }
}