class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        int i = 1;
        int n = intervals.length;

        while (i < n) {

            if (intervals[i][0] > end) {
                int[] temp = new int[2];
                temp[0] = start;
                temp[1] = end;
                merged.add(temp);

                start = intervals[i][0];
                end = intervals[i][1];
            }

            else if (intervals[i][1] > end) {
                end = intervals[i][1];
            }

            i++;

        }

        int[] temp = new int[2];

        temp[0] = start;
        temp[1] = end;
        merged.add(temp);


        return merged.toArray(new int[merged.size()][2]);

    }
}