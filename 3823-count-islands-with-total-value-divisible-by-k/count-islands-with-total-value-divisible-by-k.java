class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;

        int[][] direction = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0) {

                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[] { i, j });
                    long temp = grid[i][j];
                    grid[i][j] = 0;

                    while (!q.isEmpty()) {

                        int[] d = q.poll();
                        int x = d[0], y = d[1];

                        for (int[] dir : direction) {

                            int newX = x + dir[0];
                            int newY = y + dir[1];

                            if ((newX >= 0 && newX < row) && (newY >= 0 && newY < col) && grid[newX][newY] != 0) {
                                temp += grid[newX][newY];
                                q.offer(new int[] { newX, newY });
                                grid[newX][newY] = 0;
                            }

                        }

                    }

                    if (temp % k == 0) {
                        ans++;
                    }

                }
            }
        }

        return ans;

    }
}