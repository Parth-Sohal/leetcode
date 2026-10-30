class Solution {
    public boolean canJump(int[] nums) {


        int maxJumps = nums[0], n = nums.length;

        for (int i = 1; i < n; i++) {

            if (maxJumps >= i) {
                maxJumps = Math.max(maxJumps, i + nums[i]);
                if (maxJumps >= n - 1) {
                    return true;
                }
            } else {
                return false;
            }

        }

        return true ; 
    }
}