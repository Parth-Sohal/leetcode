class Solution {
    public int minOperations(int[] nums, int x) {

        int find = Arrays.stream(nums).sum() - x;
        int max = -1;
        int start = 0;
        int sum = 0;

        if (find == 0) return nums.length;
        if (find < 0) return -1;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            while (sum > find && start <= i) {
                sum -= nums[start++];
            }

            if (sum == find) {
                max = Math.max(max, i - start + 1);
            }

        }

        return max == -1 ? -1 : (nums.length - max);

    }
}