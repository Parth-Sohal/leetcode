class Solution {
     public static int minCostClimbingStairs(int[] cost , int idx , int[] dp ) {

        if(idx >= cost.length ){
            return 0 ;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int a = cost[idx] + minCostClimbingStairs(cost, idx + 1 , dp); // jump one
        int b = cost[idx] + minCostClimbingStairs(cost , idx+2 , dp); // jump 2


        return dp[idx] = Math.min(a,b);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);

        minCostClimbingStairs(cost , 0 , dp);

        return Math.min(dp[0] , dp[1]) ;


    }
}