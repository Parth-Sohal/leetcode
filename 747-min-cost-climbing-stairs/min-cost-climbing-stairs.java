class Solution {

    // top down
    public int minCost1(int[] cost, int idx, int[] dp) {

        if (idx >= cost.length) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        int pickOne = cost[idx] + minCost1(cost, idx + 1, dp);
        int pickTwo = cost[idx] + minCost1(cost, idx + 2, dp);

        return dp[idx] = Math.min(pickOne, pickTwo);

    }

    // bottom up
    public int minCost2(int[] nums) {

        int n = nums.length;
        int[] dp = new int[nums.length];
        dp[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            int a = dp[i + 1];
            int b = 0;

            if (i + 2 < n) {
                b = dp[i + 2];
            }

            dp[i] = Math.min(a + nums[i], b + nums[i]);

        }

        return Math.min(dp[0], dp[1]);

    }

    public  int minCost(int[] cost) {

        int[] dp = new int[cost.length + 1];
        int n = cost.length;
        dp[n - 1] = cost[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            int a = cost[i] + dp[i + 1];
            int b = cost[i] + dp[i + 2];

            dp[i] = Math.min(a, b);

        }

        return Math.min(dp[0], dp[1]);

    }

    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost);
    }
}