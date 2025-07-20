class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        long long maxSum = 0;
        long long sum = 0;
        int start = 0;
        int i = 0;

        unordered_map<int, int> mpp;

        while (i < nums.size()) {
            // cout  << i << endl;
            int key = nums[i];

            if (mpp.find(key) == mpp.end()) {
                mpp[key]++;
            } else {

                if(mpp[key] == 0){
                    mpp[key]++;
                }
                else{
                    mpp[nums[start]]--;
                    sum -= nums[start];
                    start++;
                    continue;
                }
                // i++;
                // continue;
            }

            sum += nums[i];
            if ((i - start + 1) == k) {
                // cout << start << " to  " << i << " = " << sum << endl;
                if(sum > maxSum){
                    maxSum = sum ;
                }
                mpp[nums[start]]--;
                sum -= nums[start];
                start++;
            }
            i++;
        }

        return maxSum;
    }
};