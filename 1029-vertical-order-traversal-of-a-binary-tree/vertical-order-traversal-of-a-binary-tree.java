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

    public static void dfs(
            TreeNode root,
            int row,
            int col,
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {

        if (root == null) {
            return;
        }

        if (!map.containsKey(col)) {
            map.put(col, new TreeMap<>());
        }

        if (!map.get(col).containsKey(row)) {
            map.get(col).put(row, new PriorityQueue<>());
        }

        map.get(col).get(row).offer(root.val);

        dfs(root.left, row + 1, col - 1, map);
        dfs(root.right, row + 1, col + 1, map);

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        List<List<Integer>> list = new ArrayList<>();

        dfs(root, 0, 0, map);

        for (Integer Col : map.keySet()) {
            List<Integer> temp = new ArrayList<>();
            for (Integer Row : map.get(Col).keySet()) {
                PriorityQueue<Integer> pq = map.get(Col).get(Row);

                while (!pq.isEmpty()) {
                    temp.add(pq.poll());
                }
            }
            list.add(temp);
        }

        return list;
    }
}