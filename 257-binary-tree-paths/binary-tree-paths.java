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

    public List<String> path(TreeNode root, String ans, List<String> list) {

        if (root == null) {
            return list;
        }

        if (root.left == null && root.right == null) {

             if(null == ans || ans.isEmpty()){
                list.add(ans+root.val);
                return list ;
            }
            
            list.add(ans+"->"+root.val);
            return list ;
        }

        if (null == ans || ans.isEmpty()) {
            path(root.left, ans + root.val, list);
            path(root.right, ans + root.val, list);
        }

        else {
            path(root.left, ans + "->" + root.val, list);
            path(root.right, ans + "->" + root.val, list);
        }

        return list;

    }

    public List<String> binaryTreePaths(TreeNode root) {
        return path(root, "", new ArrayList<>());
    }
}