class Solution {
    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int res = arr[mid] - (mid + 1);
            if (res < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (high < 0) {
            return k ;
        }

        int res = (arr[high] - (high + 1));
        int ans = (arr[high] + (k - res));

        return ans ; 
    }
}