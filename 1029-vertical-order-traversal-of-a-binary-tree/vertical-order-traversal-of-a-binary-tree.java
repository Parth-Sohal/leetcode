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

    public void verticalOrder(
        TreeNode root , 
        TreeMap< Integer , TreeMap<Integer , PriorityQueue<Integer>>> map ,
         int row , int col 
         ){

            if(root == null){
                return ;
            }

            if(!map.containsKey(col)){
                map.put(col , new TreeMap<>() ) ;
            }

            if(!map.get(col).containsKey(row)){
                map.get(col).put(row , new PriorityQueue<>() ) ;
            }

            map.get(col).get(row).add(root.val);

            verticalOrder(root.left, map , row + 1 , col - 1 ) ;
            verticalOrder(root.right, map , row + 1 , col + 1 ) ;

         }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map = new TreeMap<>() ;
        verticalOrder(root, map , 0 , 0);

        List<List<Integer>> list = new ArrayList<>() ;

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