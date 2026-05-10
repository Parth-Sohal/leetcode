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

    public long kth(TreeNode root, int k) {

        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Long> list = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();

            long sum = 0;
            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();
                sum += temp.val;

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }

            }

            list.add(sum);
        }

        Collections.sort(list);

        if (k > list.size()) {
            return -1;
        }

        return list.get(list.size() - k);

    }

    public long kthLargestLevelSum(TreeNode root, int k) {

        return kth(root, k);

    }
}