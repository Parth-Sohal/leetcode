class Solution {
    public int countServers(int[][] grid) {

        int ans = 0;

        // n * m
        int row = grid.length;// n
        int col = grid[0].length; // m

        for (int _row = 0; _row < row; _row++) {
            for (int _col = 0; _col < col; _col++) {

                if (grid[_row][_col] == 1) {

                    int temp = 0;

                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[] { _row, _col });
                    grid[_row][_col] = 0;

                    while (!q.isEmpty()) {

                        int[] arr = q.poll();
                        int x = arr[0];
                        int y = arr[1];
                        temp++;

                        for (int i = 0; i < col; i++) {

                            if (grid[x][i] == 1) {
                                grid[x][i] = 0;
                                q.offer(new int[] { x, i });
                            }

                        }

                        for (int i = 0; i < row; i++) {

                            if (grid[i][y] == 1) {
                                grid[i][y] = 0;
                                q.offer(new int[] { i, y });
                            }

                        }

                    }

                    if (temp > 1) {
                        ans += temp;
                    }

                }

            }
        }

        // System.out.println(ans);

        return ans;

    }
}