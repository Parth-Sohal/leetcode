class Solution {
public:
    int countHillValley(vector<int>& nums) {
        int i = 1;
        int end = nums.size() - 1;
        int count = 0;

        while (i < end) {
            int j = i - 1;
            int k = i + 1;

            if (nums[i] == nums[j]) {
                i++;
                continue;
            }

            // cout << nums[j] << " " << nums[i] << " " << nums[k] << endl;

            if (nums[i] == nums[k]) {
                while (k < nums.size() && nums[k] == nums[i]) {
                    k++;
                }
                if (k == nums.size()) {
                    break;
                }
            }

            // cout << nums[j] << " " << nums[i] << " " << nums[k] << endl;

            if (nums[i] == nums[k]) {
                i++;
                continue;
            }

            // cout << nums[j] << " " << nums[i] << " " << nums[k] << endl;

            if ((nums[i] > nums[j] && nums[i] > nums[k]) ||
                (nums[i] < nums[j] && nums[i] < nums[k])) {
                count++;
            }

            i++;
        }
        return count;
    }
};