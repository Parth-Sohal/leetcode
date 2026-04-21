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

    public static int maxDepth1(TreeNode root){
        if(root == null){
            return 0 ;
        }

        return Math.max(maxDepth1(root.left), maxDepth1(root.right)) + 1;

    }

    public static int maxDepth2(TreeNode root){
        // bfs

        if(root == null){
            return 0 ;
        }

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int ans =  0 ;

        while(!q.isEmpty()){

            int size = q.size();

            for(int i = 0 ; i < size ; i++){

                TreeNode temp = q.poll();

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }

            }

            ans++;


        }

        return ans;


    }

    public int maxDepth(TreeNode root) {
        return maxDepth2(root);
    }
}