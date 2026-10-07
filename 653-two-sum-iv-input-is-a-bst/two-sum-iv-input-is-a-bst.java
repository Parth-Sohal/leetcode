class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return dfs(root, k, set);
    }

    private boolean dfs(TreeNode root, int k, Set<Integer> set) {
        if (root == null) return false;
        
        // If target - val exists in set, we found our pair
        if (set.contains(k - root.val)) return true;
        
        set.add(root.val);
        
        // Search left subtree first, then right subtree
        return dfs(root.left, k, set) || dfs(root.right, k, set);
    }
}