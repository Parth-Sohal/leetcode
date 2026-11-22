class Solution {
    public static int minFallingPathSum(int[][] matrix, int row, int col, int[][] dp) {

        if (row < 0 || row > matrix.length - 1 || col < 0 || col > matrix[0].length - 1) {
            return Integer.MAX_VALUE;
        }

        if (row == matrix.length - 1) {
            return matrix[row][col];
        }

        if (dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }

        int a = minFallingPathSum(matrix, row + 1, col - 1, dp);
        int b = minFallingPathSum(matrix, row + 1, col, dp);
        int c = minFallingPathSum(matrix, row + 1, col + 1, dp);

        return dp[row][col] = Math.min(a, Math.min(b, c)) + matrix[row][col];

    }

    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            ans = Math.min(ans, minFallingPathSum(matrix, 0, i, dp));
        }

        return ans ; 
    }
}