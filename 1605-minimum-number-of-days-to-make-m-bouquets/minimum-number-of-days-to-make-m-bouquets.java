class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = Arrays.stream(bloomDay).min().getAsInt();
        int end = Arrays.stream(bloomDay).max().getAsInt();

        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            int count = 0;
            int result = 0;
            for (int j = 0; j < bloomDay.length; j++) {

                if (bloomDay[j] <= mid) {
                    count++;
                } else {
                    result += (count / k);
                    count = 0;
                }

            }

            result += (count / k);

            if (result < m) {
                start = mid + 1;
            }

            else {
                ans = mid;
                end = mid - 1;
            }
        }

        return ans ;
    }
}