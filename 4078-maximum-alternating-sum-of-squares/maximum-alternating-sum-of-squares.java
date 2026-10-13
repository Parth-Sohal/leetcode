class Solution {
    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        long ans = 0;

        for (int i = n - 1; i >= 0; i--) {

            if (i >= n / 2) {
                ans += nums[i] * nums[i];
            }

            else {
                ans -= nums[i] * nums[i];
            }

        }

        return ans;

    }

}