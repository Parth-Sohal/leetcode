class Solution {
    public int findDuplicate(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int idx = nums[i];

            if (nums[i] == nums[idx - 1]) {
                i++;
            }

            else {
                int temp = nums[i];
                nums[i] = nums[idx - 1];
                nums[idx - 1] = temp;
            }

        }

        return nums[nums.length -1];

    }
}