class Solution {
    public static int minimumTotal(List<List<Integer>> triangle, int row, int col, int[][] dp) {

        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        if (dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }

        int next = minimumTotal(triangle, row + 1, col, dp);
        int adjectNext = minimumTotal(triangle, row + 1, col + 1, dp);

        return dp[row][col] = Math.min(next, adjectNext) + triangle.get(row).get(col);

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = row - 1; i >= 0; i--) {

            for (int j = 0; j < triangle.get(i).size(); j++) {

                if (i == row - 1) {
                    list.get(i).add(triangle.get(i).get(j));
                }

                else {
                    int val = triangle.get(i).get(j) + Math.min(list.get(i + 1).get(j + 1), list.get(i + 1).get(j));
                    list.get(i).add(val);

                }
            }

        }

        return list.get(0).get(0);
    }
}