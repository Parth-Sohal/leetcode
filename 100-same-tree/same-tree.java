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

    public static boolean sameTree(TreeNode q1, TreeNode q2) {

        if (q1 == null && q2 == null) {
            return true;
        }
        if ((q1 == null && q2 != null) || (q2 == null && q1 != null)) {
            return false;
        }
        if (q1.val != q2.val) {
            return false;
        }

        boolean ans = sameTree(q1.left, q2.left) && sameTree(q1.right, q2.right);
        return ans;

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        return sameTree(p,q);

    }
}