class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        int n = nums.length;

        while (i < n && k > 0) {

            if (nums[i] < 0) {
                nums[i] = nums[i] * -1;
            }

            else {
                break;
            }

            i++;
            k--;

        }

        Arrays.sort(nums);

        if (k % 2 != 0 ) {

            nums[0] = nums[0]*-1;

        }

        int sum = 0;

        for (int it : nums) {
            sum += it;
        }

        return sum;
    }
}