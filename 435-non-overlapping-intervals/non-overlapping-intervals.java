class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        int idx = 1;
        int ans = 0;

        while (idx < intervals.length) {

            if (end > intervals[idx][0]) {
                ans++;
                end = Math.min(end, intervals[idx][1]);
            }

            else {
                start = intervals[idx][0];
                end = intervals[idx][1];
            }

            idx++;

        }

        return ans;
    }
}