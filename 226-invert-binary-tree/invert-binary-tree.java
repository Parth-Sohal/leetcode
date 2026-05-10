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

    public TreeNode mirrorTree2(TreeNode root) {

        if(root == null){
            return null ;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);


        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode temp = queue.poll();

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }

                TreeNode curr = temp.left;
                temp.left = temp.right;
                temp.right = curr;

            }

        }

        return root ; 



    }

    public static void mirrorTree(TreeNode root) {

        if (root == null) {
            return;
        }

        mirrorTree(root.left);
        mirrorTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

    }

    public TreeNode invertTree(TreeNode root) {
        mirrorTree2(root);
        return root;
    }
}