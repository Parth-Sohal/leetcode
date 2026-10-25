class Solution {

    public void bfs(char[][] grid, int x, int y, boolean[][] visited) {

        int[][] directions = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };
        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        int row = grid.length, col = grid[0].length;

        q.add(new int[] { x, y });

        while (!q.isEmpty()) {

            int[] d = q.poll();
            int currX = d[0];
            int currY = d[1];

            for (int[] dir : directions) {

                int newX = currX + dir[0];
                int newY = currY + dir[1];

                if ((newX >= 0 && newX < row) && (newY >= 0 && newY < col) && !visited[newX][newY]
                        && grid[newX][newY] == '1') {
                    visited[newX][newY] = true;
                    q.add(new int[] { newX, newY });
                }

            }

        }

    }

    public  int numIslands(char[][] grid) {

        // bfs

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, i, j, visited);
                    count++;
                }

            }
        }

        return count;

    }

}