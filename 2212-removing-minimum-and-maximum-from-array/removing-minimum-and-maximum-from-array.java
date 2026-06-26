class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n <= 2)
            return n;

        int max = Integer.MAX_VALUE;

        int maxIdx = 0;
        int minIdx = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }

            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }

        }

        // 3 cond 

        int a = Math.max(maxIdx, minIdx) + 1;
        int b = Math.min(maxIdx, minIdx);

        int c = (b + 1) + (n - a + 1);

        max = Math.min(a, Math.min(c, n - b));

        return max;

    }
}