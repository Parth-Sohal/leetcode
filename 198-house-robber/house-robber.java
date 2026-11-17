class Solution {


    public int rob1(int[] nums , int idx , int[] dp){

        if(idx >= nums.length){
            return 0 ;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int pick = nums[idx]  + rob1(nums , idx + 2 ,dp);
        int dontPick = rob1(nums , idx + 1 , dp  );

        return dp[idx] = Math.max(pick,dontPick);
    
    }
    
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return rob1(nums, 0 , dp );
    }
}