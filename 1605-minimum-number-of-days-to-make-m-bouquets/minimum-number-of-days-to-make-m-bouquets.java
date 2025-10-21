class Solution {
    private boolean helper(int[] arr, int m, int k, int day) {
        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            }

            else {
                res += (count / k);
                count = 0;
            }
        }

        res += (count / k);

        return res >= m;

    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length)
            return -1;

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (helper(bloomDay, m, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}