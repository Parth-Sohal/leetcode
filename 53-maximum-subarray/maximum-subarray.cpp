class Solution {
public:
    int maxSubArray(vector<int>& nums) {

        int sum = 0;
        int i = 0;
        int maxSum = INT_MIN;

        while (i < nums.size()) {
            sum += nums[i];

            maxSum = max(sum, maxSum);

            if (sum < 0) {
                sum = 0;
            }
            i++;
        }

        return maxSum ;
    }
};