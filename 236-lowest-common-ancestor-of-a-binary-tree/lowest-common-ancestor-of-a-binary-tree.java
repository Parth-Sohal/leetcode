/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean lowestCommonAns(TreeNode root, TreeNode p, TreeNode q, TreeNode[] ans) {

        if (root == null) {
            return false;
        }

        boolean left = lowestCommonAns(root.left, p, q, ans);
        boolean right = lowestCommonAns(root.right, p, q, ans);

        if (left && right) {
            // System.out.println(root.val + " ");
            ans[0] = root;
            return true;
        }

        if (left || right) {
            if (root == p || root == q) {
                ans[0] = root;
                // System.out.println(root.val + " ");
            }
            return true;
        }

        return root == p || root == q;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode[] ans = new TreeNode[1];
        ans[0] = null;

        lowestCommonAns(root, p, q, ans);
        return ans[0];
    }
}