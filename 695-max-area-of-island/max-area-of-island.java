class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int[][] direction = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == 1) {

                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[] { row, col });

                    int temp = 1;

                    grid[row][col] = 0;

                    while (!q.isEmpty()) {

                        int[] arr = q.poll();
                        int x = arr[0], y = arr[1];

                        for (int[] dir : direction) {

                            int newX = x + dir[0];
                            int newY = y + dir[1];

                            if ((newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length)
                                    && grid[newX][newY] == 1) {
                                q.add(new int[] { newX, newY });
                                grid[newX][newY] = 0;
                                temp++;
                            }

                        }

                    }

                    max = Math.max(max, temp);

                }

            }
        }

        return max ; 

    }
}