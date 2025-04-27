class Solution {
public:
    int search(vector<int>& nums, int target) {
        int start = 0;
        int end = nums.size() - 1;
        // int target = 2;

        while (start <= end) {
            int mid = (start + end) / 2;
            // cout << nums[mid] << endl;
            // cout << nums[start] << " " << nums[end] << endl;

            if (nums[mid] == target) {
                return mid;
                // cout << "Here" << mid << " " << nums[mid] << endl;
                // break;
            }

            if (nums[mid] < nums[end]) {
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
};