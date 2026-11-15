class Solution {
    public boolean helper(int[] nums, long mid, long k) {

        long ans = 0;

        for (int i : nums) {
            ans += (i / mid);
            if (ans >= k)
                return true;
        }

        return ans >= k;

    }

    public int maximumCandies(int[] candies, long k) {

        long low = 1;
        long high = 0;

        for (int i : candies) {
            high = Math.max(high, i);
        }

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (helper(candies, mid, k)) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }

        }

        return (int) high;

    }
}