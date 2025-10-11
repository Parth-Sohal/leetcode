class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr[mid] - (mid + 1);
            if (val < k) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }

        }

        // System.out.println(ans);

        if (ans > -1) {
            // System.out.println(arr[ans] - (ans + 1));
            int store = ((arr[ans] - (ans + 1)) - k + 1);
            return arr[ans] - store;
        }

        else {
            int store = (arr[arr.length - 1] - (arr.length));
            return arr[arr.length - 1] + (k - store);
        }

        // return -1;
    }
}