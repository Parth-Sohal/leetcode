class Solution {
public:
    void nextPermutation(vector<int>& nums) {

        // break point jaha longest prefix mile

        int n = nums.size() ;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                idx = i;
                break;
            }
        }

        if (idx == -1)
            reverse(nums.begin(), nums.end());

        else {
            int i = n - 1;
            while (i > idx && nums[i] <= nums[idx]) {
                i--;
            }

            swap(nums[idx], nums[i]);
            reverse(nums.begin() + idx + 1, nums.end());
        }
    }
};