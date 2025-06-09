class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int i = 0;
        int j = 0;
        // int val = 2;

        while (j < nums.size()) {
            if (nums[j] == val) {
                j++;
            } else {
                swap(nums[i], nums[j]);
                i++;
                j++;
            }
        }

        return i;
    }
};