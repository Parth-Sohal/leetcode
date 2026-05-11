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

    public static List<Integer> rightView(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode temp = queue.poll();

                if (i == size - 1) {
                    list.add(temp.val);
                }

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }

            }

        }

        return list ;

    }


    public static List<Integer> right(TreeNode root, List<Integer> list , int level){

        if(root == null){
            return list ;
        }

        if(level == list.size()){
            list.add(root.val);
        }

        right(root.right,list,level+1);
        right(root.left,list,level+1);


        return list ;

    }

    public List<Integer> rightSideView(TreeNode root) {
        return right(root , new ArrayList<>() , 0); 
    }
}