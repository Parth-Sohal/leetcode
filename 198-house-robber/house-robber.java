class Solution {

     public int rob2(int[] arr){

        int n = arr.length;
        int[] dp = new int[arr.length];
        dp[n - 1] = arr[n - 1];

        for(int i = n - 2 ; i >= 0 ; i --){

            int a = dp[i+1];
            int b = arr[i];

            if(i+2 < n){
                b += dp[i+2];
            }

            dp[i] = Math.max(a, b);

        }

        return dp[0];

    }

    public int rob(int[] nums) {
        return rob2(nums);
    }
}