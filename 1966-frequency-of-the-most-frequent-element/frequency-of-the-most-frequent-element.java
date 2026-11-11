class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int max = 0;
        long currSum = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {

            currSum += nums[i];

            while ((long) nums[i] * (i - start + 1) - currSum > k) {
                currSum -= nums[start];
                start++;
            }

            max = Math.max(i - start + 1, max);

        }

        return max;
    }
}