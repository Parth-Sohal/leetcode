class Solution {
    public void dfs(int[][] grid, int row, int col) {

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return;
        }

        grid[row][col] = 0;

        dfs(grid, row - 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
        dfs(grid, row + 1, col);

    }

    public int numEnclaves(int[][] grid) {

        //0 0 0 0 0
        //1 1 0 1 0
        //0 1 0 1 0
        //0 0 0 0 0

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == 1
                        && (row == 0 || row == grid.length - 1 || col == 0 || col == grid[0].length - 1)) {
                    dfs(grid, row, col);
                
                }

            }
        }

        // System.out.println(Arrays.deepToString(grid));

        int count = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    count++;
                }
            }
        }

        return count;

    }

}