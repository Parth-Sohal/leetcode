class Solution {

     class Pair {
        int xIdx;
        int yIdx;
        int distance;

        public Pair(int xIdx, int yIdx, int distance) {
            this.xIdx = xIdx;
            this.yIdx = yIdx;
            this.distance = distance;
        }
    }

    public int shortestPath(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        if (grid[0][0] != 0 || grid[row - 1][col - 1] != 0) {
            return -1;
        }

        int[][] directions = {
                { 0, -1 }, // left
                { 0, 1 }, // right
                { -1, 0 }, // up
                { 1, 0 }, // down

                { -1, -1 }, // \
                { -1, 1 }, // />
                { 1, -1 }, // </
                { 1, 1 }, // \
        };

        Pair p = new Pair(0, 0, 0);
        Queue<Pair> q = new LinkedList<>();
        q.add(p);
        boolean[][] visited = new boolean[row][col];
        visited[0][0] = true;

        while (!q.isEmpty()) {

            Pair temp = q.poll();

            if (temp.xIdx == row - 1 && temp.yIdx == col - 1) {
                return temp.distance + 1;
            }

            int dist = temp.distance;

            for (int[] dir : directions) {

                int nx = temp.xIdx + dir[0];
                int ny = temp.yIdx + dir[1];

                if ((nx >= 0 && nx < row && ny >= 0 && ny < col && !visited[nx][ny]) && (grid[nx][ny] == 0)) {
                    visited[nx][ny] = true;
                    q.add(new Pair(nx, ny, dist + 1));
                }

            }

        }

        return -1;

    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        return shortestPath(grid)  ;
    }
}