class Solution {
    public boolean isPerfectSquare(int n) {

        long low = 1;
        long high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long prod = mid * mid ; 

            if (prod == n) {
                return true;
            }

            else if (prod > n) {
                high = mid - 1;
            }

            else
                low = mid + 1;

        }
        return false;

    }
}