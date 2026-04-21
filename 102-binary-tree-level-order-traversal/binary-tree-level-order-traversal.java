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
    public List<List<Integer>> levelOrder(TreeNode root) {
         if(root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        List<List<Integer>> list = new ArrayList<>();


        while(!q.isEmpty()){

            int size = q.size();
            ArrayList<Integer> tempList = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode temp = q.poll();

                tempList.add(temp.val);

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }

            }

            list.add(tempList);
        }


        return list ;

    }
}