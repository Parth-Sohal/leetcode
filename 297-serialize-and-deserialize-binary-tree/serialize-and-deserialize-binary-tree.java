/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public void serlizeII(List<String> strs, TreeNode root) {

        if (root == null) {
            strs.add(new String("X"));
            return;
        }

        int val = root.val;
        strs.add(String.valueOf(val));

        serlizeII(strs, root.left);
        serlizeII(strs, root.right);

    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> ans = new ArrayList<>();
        serlizeII(ans, root);

        String result =  String.join("," , ans);
        return result ; 

    }

    public static TreeNode deserlizeII(String[] strs, int[] idx) {

        if(idx[0] >= strs.length){
            return null ;
        }

        String val = strs[idx[0]] ;
        idx[0]++ ;

        if(val.equals("X")){
            return null ;
        }

        TreeNode root = new  TreeNode(Integer.parseInt(val));



        TreeNode leftTree = deserlizeII(strs, idx);
        TreeNode rightTree = deserlizeII(strs, idx);

        root.left = leftTree;
        root.right = rightTree;

        return root ;


    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null  ||  data.length() == 0){
            return null ; 
        }
        String[] values = data.split(",");
        int[] idx = {0};
        return deserlizeII(values , idx); 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));