class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        
        for (int i = 0; i < nums.length; i++) {

            if (i > maxReachable) {
                return false;
            }
            

            maxReachable = Math.max(maxReachable, i + nums[i]);
            
            // Optimization: If we can reach or exceed the last index
            if (maxReachable >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}