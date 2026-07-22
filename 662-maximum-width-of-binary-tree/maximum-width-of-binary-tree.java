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
    static class Pair {

        TreeNode root;
        int index;

        public Pair(TreeNode root, int index) {
            this.root = root;
            this.index = index;
        }

    }

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<Pair> queue = new LinkedList<>();
        int ans = 0;

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            int size = queue.size();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {

                Pair temp = queue.poll();

                min = Math.min(min, temp.index);
                max = Math.max(max, temp.index);

                if (temp.root.left != null) {
                    queue.add(new Pair(temp.root.left, 2 * temp.index + 1));
                }

                if (temp.root.right != null) {
                    queue.add(new Pair(temp.root.right, 2 * temp.index + 2));
                }

            }

            ans = Math.max(ans, max - min + 1);

        }

        return ans;

    }
}