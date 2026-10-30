class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> lists = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        int idx = 1;

        while (idx < intervals.length) {

            if (end >= intervals[idx][0]) {
                end = Math.max(intervals[idx][1] , end);
                
            }

            else {
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);

                start = intervals[idx][0];
                end = intervals[idx][1];
                lists.add(list);
            }

            idx++;
        }

        List<Integer> list = new ArrayList<>();
        list.add(start);
        list.add(end);

        lists.add(list);

        int[][] ans = new int[lists.size()][2];

        for (int i = 0; i < lists.size(); i++) {
            ans[i][0] = lists.get(i).get(0);
            ans[i][1] = lists.get(i).get(1);
        }

        return ans;

    }
}