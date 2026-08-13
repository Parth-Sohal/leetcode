class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        int[][] directions = {
            {0, -1},
            {0, 1},
            {-1, 0},
            {1, 0}
        };

        // Put all 0s into the queue
        // and mark 1s as unvisited
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (mat[i][j] == 0) {
                    q.add(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        int distance = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] curr = q.poll();

                int x = curr[0];
                int y = curr[1];

                for (int[] dir : directions) {

                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx >= 0 && nx < row &&
                        ny >= 0 && ny < col &&
                        mat[nx][ny] == -1) {

                        mat[nx][ny] = distance;

                        q.add(new int[]{nx, ny});
                    }
                }
            }

            distance++;
        }

        return mat;
    }
}