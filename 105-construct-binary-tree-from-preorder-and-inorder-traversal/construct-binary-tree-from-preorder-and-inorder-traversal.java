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

    public TreeNode helperConstruct(HashMap<Integer, Integer> map, int left, int right, int[] pre, int[] in,
            int[] idx) {

        if (left > right) {
            return null;
        }

        TreeNode root = new TreeNode(pre[idx[0]]);
        int rootIndex = map.get(pre[idx[0]]);

        idx[0]++;

        TreeNode leftTree = helperConstruct(map, left, rootIndex - 1, pre, in, idx);
        TreeNode rightTree = helperConstruct(map, rootIndex + 1, right, pre, in, idx);

        root.left = leftTree;
        root.right = rightTree;

        return root;

    }

    public TreeNode buildTree(int[] pre, int[] in) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }

        int[] idx = { 0 };

        TreeNode ans = helperConstruct(map, 0, pre.length - 1, pre, in, idx);

        // levelOrder(ans);

        return ans;

    }
}