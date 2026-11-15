class Solution {
    public boolean helper(int[] nums, long mid, int limit) {

        long count = 0;

        for (int i : nums) {
            count += ((i + mid - 1 )/ mid);
        }

        return count <= limit;

    }

    public int minEatingSpeed(int[] nums, int h) {
        long low = 1;

        long high = nums[0];

        for (int i : nums) {
            high = Math.max(high, i);
        }
        long ans = high;

        while (low <= high) {

            long mid = low + ((high - low) / 2);

            if (helper(nums, mid, h)) {
                ans = mid ;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }

        }

        return (int)ans;
    }
}