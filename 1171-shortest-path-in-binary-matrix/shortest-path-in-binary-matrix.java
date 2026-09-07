class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1)
            return -1;
        int moves = 0;

        int[][] directions = {
                { 0, -1 },
                { 0, 1 },
                { -1, 0 },
                { 1, 0 },
                { -1, -1 },
                { -1, 1 },
                { 1, -1 },
                { 1, 1 },
        };

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        visited[0][0] = true;

        q.add(new int[] { 0, 0 });

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] curr = q.poll();
                int currX = curr[0];
                int currY = curr[1];

                if (currX == row - 1 && currY == col - 1) {
                    return moves + 1;
                }

                for (int[] dir : directions) {

                    int newX = currX + dir[0];
                    int newY = currY + dir[1];

                    if ((newX >= 0 && newX < row) && (newY >= 0 && newY < col) && grid[newX][newY] == 0
                            && !visited[newX][newY]) {
                        visited[newX][newY] = true;
                        q.add(new int[] { newX, newY });
                    }

                }

            }

            moves++;

        }

        return -1;
    }
}