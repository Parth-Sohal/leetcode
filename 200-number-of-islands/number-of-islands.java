class Solution {
    public  void dfsIsland(int row, int col, int x, int y, int[][] directions, char[][] mat) {

        mat[x][y] = 0;

        for (int[] dir : directions) {

            int nx = x + dir[0];
            int ny = y + dir[1];

            if ((nx >= 0 && nx < row) && (ny >= 0 && ny < col) && (mat[nx][ny] == '1')) {
                dfsIsland(row, col, nx, ny, directions, mat);
            }

        }

    }

    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int[][] directions = {
                { 0, -1 },
                { 0, 1 },
                { -1, 0 },
                { 1, 0 }
        };

        int ans = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == '1') {
                    dfsIsland(row, col, i, j, directions, grid);
                    ans++;
                }

            }
        }

        return ans;
    }
}