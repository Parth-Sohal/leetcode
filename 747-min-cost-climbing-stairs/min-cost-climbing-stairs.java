class Solution {


    public int minCost1(int[] cost , int idx , int[] dp) {

        if(idx >=  cost.length){
            return 0 ;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int pickOne = cost[idx] + minCost1(cost, idx + 1 , dp);
        int pickTwo = cost[idx] + minCost1(cost, idx + 2 ,dp);

        return dp[idx] =  Math.min(pickOne, pickTwo);

    }
    
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        
        minCost1(cost , 0 , dp);

        return Math.min(dp[0] , dp[1]);
    }
}