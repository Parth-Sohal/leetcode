class Solution {
    public static int minPathSum(int[][] grid, int row, int col, int[][] dp) {

        if (row >= grid.length || col >= grid[0].length) {
            return Integer.MAX_VALUE;
        }

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col];
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int right = minPathSum(grid, row, col + 1, dp);
        int down = minPathSum(grid, row + 1, col, dp);

        return dp[row][col] = Math.min(right, down) + grid[row][col];

    }

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        int row = grid.length;
        int col = grid[0].length;

        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {

                if (i == row - 1 && j == col - 1) {
                    dp[i][j] = grid[i][j];
                    continue;
                }

                int right = Integer.MAX_VALUE;
                int down = Integer.MAX_VALUE;

                if (i + 1 < row) {
                    right = dp[i + 1][j] + grid[i][j];
                }
                if (j + 1 < col) {
                    down = dp[i][j + 1] + grid[i][j];
                }

                dp[i][j] = (Math.min(right, down));

            }
        }

        return dp[0][0];
    }
}