class Solution {


    public int climb(int n , int[] dp){
        
        if(n < 0)return 0 ; 
        if(n == 0)return 1; 

        if(dp[n] != -1){
            return dp[n];
        }


        int ans = climb(n-1,dp) + climb(n-2,dp); 
        dp[n] = ans ;
        return ans ; 

    }



    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return climb(n,dp) ;
    }
}