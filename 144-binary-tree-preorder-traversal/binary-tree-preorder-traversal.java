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
    public List<Integer> preOrder(TreeNode root ){

        if(root==null){
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>() ;
        Stack<TreeNode> st = new Stack<>() ;
        st.push(root) ;


        while(!st.isEmpty()){

            TreeNode temp = st.pop() ;

            while(temp != null){


                if(temp.right != null){
                    st.push(temp.right);
                }

                list.add(temp.val);

                temp = temp.left ;


            }


        }   
        
        return list ;
    


    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
        return preOrder(root);
    }
}