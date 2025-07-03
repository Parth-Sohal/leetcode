class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min = prices[0];
        // int i = 1;
        int maxProfit = 0;

        for (int i = 1; i < prices.size(); i++) {

            // choosing the best stock here
            if (prices[i] < min) {
                min = prices[i];
            }
            // selling at the right time
            else {
                int profit = prices[i] - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
};