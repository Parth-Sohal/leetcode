class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        // int key = k;
        int maxLenght = 0;
        // o(n^2) 3 loops to cal the max subbarray
        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;
            for (int j = i; j < nums.size(); j++) {
                sum += nums[j];
                if (sum == k) {
                    maxLenght++;
                }
            }
        }
        return maxLenght;
    }
};