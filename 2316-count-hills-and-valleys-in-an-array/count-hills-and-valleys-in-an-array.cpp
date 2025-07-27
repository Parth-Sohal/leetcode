class Solution {
public:
    int countHillValley(vector<int>& nums) {
        int count = 0;
        int i = 1, n = nums.size() - 1;

        while (i < n) {
            while (i < n - 2 && nums[i] == nums[i - 1])
                i++;
            int j = i - 1;
            int k = i + 1;
            while (k < n && nums[i] == nums[k])
                k++;
            // cout << j << " " << i << " " << k << endl;

            if ((nums[i] > nums[j] && nums[i] > nums[k]) ||
                (nums[i] < nums[j] && nums[i] < nums[k]))
                count++;

            i++;
        }

        return count ; 
    }
};