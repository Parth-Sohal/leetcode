class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {

        int i = 0;
        vector<string> ans;
        int n = nums.size();
        
        while (i < n) {
            int range = i + 1;

            while (range < nums.size()) {
                if (nums[range] == nums[range - 1] + 1) {
                    range++;
                } else {
                    break;
                }
            }

            // cout << nums[i] << " " << nums[range-1] << endl;

            if (i == range - 1) {
                ans.push_back(to_string(nums[i]));
            } else {
                ans.push_back(to_string(nums[i]) + "->" +
                              to_string(nums[range - 1]));
            }

            i = range;
        }

        return ans;
    }
};