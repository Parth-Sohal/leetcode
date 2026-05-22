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

    public static TreeNode addRow(TreeNode root, int val, int depth) {

        if (1 == depth) {
            TreeNode temp = new TreeNode(val);
            temp.left = root;
            return temp;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                if (level == depth - 1) {
                    TreeNode temp = queue.poll() ;

                    TreeNode a = new  TreeNode(val);
                    TreeNode b = new  TreeNode(val);

                    TreeNode prevLeft = temp.left ;
                    TreeNode prevRight = temp.right ;

                    temp.left = a ;
                    a.left = prevLeft ;


                    temp.right = b ;
                    b.right = prevRight ;

                    

                }

                else {

                    TreeNode temp = queue.poll();

                    if (temp.left != null) {
                        queue.add(temp.left);
                    }

                    if (temp.right != null) {
                        queue.add(temp.right);
                    }

                }

            }

            if (level == depth - 1) {
                break;
            }

            level++;

        }

        return root;

    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return addRow(root,val,depth) ;
    }
}