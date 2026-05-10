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

    public static List<List<Integer>> zigzag(TreeNode root){


        if(root == null){
            return new ArrayList<>() ;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        List<List<Integer>> list = new ArrayList<>();
        int level = 0 ;

        while(!q.isEmpty()){

            int size = q.size();


            List<Integer> temp1 = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.poll() ;
                temp1.add(temp.val);
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }



            if (level % 2 != 0){
                Collections.reverse(temp1);
            }

            list.add(temp1);


            level++;


        }

        return list ;

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return zigzag(root); 
    }
}