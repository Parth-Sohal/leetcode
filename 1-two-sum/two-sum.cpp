class Solution {
public:
    
    vector<int> twoSum(vector<int>& nums, int target) {

        unordered_map<int, int> mp;
        for (int i = 0; i < nums.size(); i++) {
            mp[nums[i]] = i;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (i == mp[target - nums[i]]) {
                continue;
            }
            // cout << arr[mp[target - arr[i]]] << endl;
            if (nums[mp[target - nums[i]]] + nums[i] == target) {
                return {i,mp[target-nums[i]]};
            }
        }

        return {-1, -1};
    }
};