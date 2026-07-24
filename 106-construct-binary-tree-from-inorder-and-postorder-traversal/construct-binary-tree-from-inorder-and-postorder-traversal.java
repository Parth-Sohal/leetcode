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

    public TreeNode helperConstructPostToIn(
            HashMap<Integer, Integer> map, int left, int right, int[] pre, int[] in, int[] idx) {

        if (left > right || idx[0] < 0) {
            return null;
        }

        TreeNode root = new TreeNode(pre[idx[0]]);
        int rootIndex = map.get(pre[idx[0]]);

        idx[0]--;

        TreeNode rightTree = helperConstructPostToIn(map, rootIndex + 1, right, pre, in, idx);
        TreeNode leftTree = helperConstructPostToIn(map, left, rootIndex - 1, pre, in, idx);

        root.right = rightTree;
        root.left = leftTree;

        return root;

    }

    public TreeNode buildTree(int[] in, int[] post) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }

        int idx[] = { in.length - 1 };

        TreeNode ans = helperConstructPostToIn(map, 0, in.length - 1, post, in, idx);

        return ans ; 

    }
}