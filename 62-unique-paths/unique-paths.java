class Solution {
    public int uniquePaths(int row, int col, int rowIdx, int colIdx, int[][] dp) {
        if (rowIdx >= row || colIdx >= col) {
            return 0;
        }

        if (rowIdx == row - 1 && colIdx == col - 1) {
            return 1;
        }

        if (dp[rowIdx][colIdx] != -1) {
            return dp[rowIdx][colIdx];
        }

        return dp[rowIdx][colIdx] = uniquePaths(row, col, rowIdx, colIdx + 1, dp)
                + uniquePaths(row, col, rowIdx + 1, colIdx, dp);

    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return uniquePaths(m, n, 0, 0, dp);
    }
}