class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> mpp;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {

            sum += nums[i];

            if (sum == k) {
                // cout << 0 << " " << i << endl;
                count++;
            }

            auto it = sum - k;

            if (mpp.find(it) != mpp.end()) {
                // cout << mpp[it] + 1 << " " << i << endl;
                count += mpp[it];
            }

            mpp[sum]++;
        }

        return count;
    }
};