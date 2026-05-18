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
    public boolean isCousins(TreeNode root, int x, int y) {

     
        if(root == null || root.val == x || root.val == y)return false ; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root); 

        while(!q.isEmpty()){

            int size = q.size() ;

            boolean searchX = false  ; 
            boolean searchY = false ; 

            for(int i = 0 ; i < size ; i++){

                TreeNode temp = q.poll();

                if(temp.left != null && temp.right != null){

                    if((temp.left.val == x && temp.right.val == y) ||
                       (temp.left.val == y && temp.right.val == x)){

                        return false;
                    }
                }

                if(temp.val == x){
                    searchX = true ;
                }
                if(temp.val == y){
                    searchY = true ;
                }

                if(temp.left != null){
                    q.add(temp.left);
                }

                if(temp.right != null){
                    q.add(temp.right);
                }

            }

            if(searchX && searchY){
                return true  ;
            }

        }

        return false; 




    }
}