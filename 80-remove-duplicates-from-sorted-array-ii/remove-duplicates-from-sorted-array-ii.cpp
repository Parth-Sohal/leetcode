class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 1;
        int j = 1;

        int currentElement = nums[0];
        int count = 1;

        while (j < nums.size()) {

            if (nums[j] == currentElement) {

                if (count < 2) {
                    count++;
                    nums[i] = nums[j];
                    i++;
                }

            }

            else {

                nums[i] = nums[j];
                i++;
                count = 1;
                currentElement = nums[j];
            }

            j++;
        }

        return i;
    }
};