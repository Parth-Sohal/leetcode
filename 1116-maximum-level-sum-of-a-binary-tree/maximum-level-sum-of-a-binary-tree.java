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


    public static int max(TreeNode root){

        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root) ;
        int max = Integer.MIN_VALUE ;
        int level = 1 ; 
        int ans = 1 ;

        while(!q.isEmpty()){

            int size = q.size() ;
            int sum = 0 ; 

            for(int i = 0 ; i < size ; i++){

                TreeNode temp = q.poll() ;

                sum += temp.val ;

                if(temp.left != null ){
                    q.add(temp.left );
                }

                if(temp.right != null) {
                    q.add(temp.right) ;
                }


            }


            if(sum > max){
                max = sum ;
                ans = level ; 
            }

            level++ ;


        }

        return ans  ; 



    }


    public int maxLevelSum(TreeNode root) {
        
        return max(root) ;

    }
}