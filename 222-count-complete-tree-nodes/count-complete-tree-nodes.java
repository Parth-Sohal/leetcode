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

    int heightLeft(TreeNode root){


        int h = 0 ;

        while(root != null){
            h++;
            root = root.left ;
        }

        return h ; 

    }


    int heightRight(TreeNode root){


        int h = 0 ;

        while(root != null){
            h++;
            root = root.right ;
        }

        return h ; 

    }

    public  int count(TreeNode root){

        if(root == null){
            return 0 ; 
        }

        int left = heightLeft(root);
       int right =  heightRight(root) ;

       if(left == right){
            return  (1 << left) - 1 ; 
       }


        return 1 + count(root.left) + count(root.right);

       

    }


    public int countNodes(TreeNode root) {
        return count(root);
    }
}