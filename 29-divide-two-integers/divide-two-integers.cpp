class Solution {
public:
    int divide(int dividend, int divisor) {

        if (dividend == 0) {
            return 0;
        }

        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        long long low = 0;
        long long high = abs((long long)dividend);
        long long ans = 0; 

        while (low <= high) {
            long long mid = low + (high - low) / 2;

            if ((mid * abs((long long)divisor)) > abs((long long)dividend)) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }

        if ((dividend < 0 && divisor > 0) || dividend > 0 && divisor < 0) {
            return -1 * ans;
        }
        return ans;
    }
};