class Solution {
    public int maxProfit(int[] prices) {
        int start = prices[0];
        int max = 0 ; 

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < start) {
                start = prices[i];
            }

            else {
                max = Math.max(max, prices[i] - start);
            }

        }

        return max;
    }
}