class Solution {

    boolean bfs(int[][] grid, int x, int y, boolean[][] visited) {

        int[][] directions = {
            {0, -1}, {0, 1}, {1, 0}, {-1, 0}
        };

        Queue<int[]> q = new LinkedList<>();

        int row = grid.length;
        int col = grid[0].length;

        boolean canTake = true;

        // Check the starting cell
        if (x == 0 || x == row - 1 ||
            y == 0 || y == col - 1) {
            canTake = false;
        }

        visited[x][y] = true;
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {

            int[] d = q.poll();

            int currX = d[0];
            int currY = d[1];

            for (int[] dir : directions) {

                int newX = currX + dir[0];
                int newY = currY + dir[1];

                if (newX >= 0 && newX < row &&
                    newY >= 0 && newY < col &&
                    !visited[newX][newY] &&
                    grid[newX][newY] == 0) {

                    visited[newX][newY] = true;
                    q.add(new int[]{newX, newY});

                    if (newX == 0 || newX == row - 1 ||
                        newY == 0 || newY == col - 1) {
                        canTake = false;
                    }
                }
            }
        }

        return canTake;
    }

    public int closedIsland(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 0 && !visited[i][j]) {

                    boolean canTake = bfs(grid, i, j, visited);

                    if (canTake) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}