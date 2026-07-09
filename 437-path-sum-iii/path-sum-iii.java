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

    public  int sumIII(TreeNode root , long currSum , long target , HashMap<Long, Integer> map){

        if(root == null){
            return 0 ; 
        }
        
        long val = currSum + root.val  ;

        int count = map.getOrDefault(val - target , 0);

        map.put(val  , map.getOrDefault(val , 0) + 1);

        count += sumIII(root.left , currSum+root.val , target , map);
        count += sumIII(root.right , currSum+root.val , target , map);


        map.put(val  , map.get(val) - 1);

        return count ; 
        



        
    }

    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
    
        map.put(0L, 1);
        return sumIII(root, 0L , targetSum , map)  ;
    }
}