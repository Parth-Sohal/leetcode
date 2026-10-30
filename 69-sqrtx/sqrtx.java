class Solution {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;

        while (low <= high) {

            long mid = low + ((high - low) / 2);

            long ans = mid * mid;

            if (ans == x)
                return (int) mid;

            if (ans < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return (int) high;
    }
}