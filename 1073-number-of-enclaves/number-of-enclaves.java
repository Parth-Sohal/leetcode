class Solution {
    public static void dfsEnclave(
            int[][] grid,
            int[][] directions,
            int x, int y) {

        grid[x][y] = 0;

        for (int[] dir : directions) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            if ((nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) && grid[nx][ny] == 1) {
                dfsEnclave(grid, directions, nx, ny);
            }

        }

    }

    public int numEnclaves(int[][] grid) {
       

        int row = grid.length;
        int col = grid[0].length;

        int[][] directions = {
                { 0, -1 },
                { 0, 1 },
                { 1, 0 },
                { -1, 0 }
        };

        // only boundary
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1 && (i == 0 || i == row - 1 || j == 0 || j == col - 1)) {
                    dfsEnclave(grid, directions, i, j);
                }

            }
        }

        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count  ; 
    }
}