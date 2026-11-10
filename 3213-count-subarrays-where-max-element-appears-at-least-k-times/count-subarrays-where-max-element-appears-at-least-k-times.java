class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i : nums) {
            max = Math.max(i, max);
        }

        int start = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == max) {
                count++;
            }

            while (count >= k) {

                ans += (n - i);

                if (nums[start] == max) {
                    count--;
                }

                start++;

            }

        }

        return ans;

    }
}