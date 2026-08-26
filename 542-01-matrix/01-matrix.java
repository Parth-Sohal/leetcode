class Solution {
    public int[][] updateMatrix(int[][] mat) {

        Queue<int[]> queue = new LinkedList<>();
        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if (mat[i][j] == 0) {
                    queue.offer(new int[] { i, j });
                } else {
                    mat[i][j] = -1;
                }

            }
        }

        int[][] directions = {
                { 0, -1 },
                { 0, 1 },
                { -1, 0 },
                { 1, 0 }
        };

        while (!queue.isEmpty()) {

            int[] dir = queue.poll();
            int val = mat[dir[0]][dir[1]];

            for (int[] dirs : directions) {
                int nx = dirs[0] + dir[0];
                int ny = dirs[1] + dir[1];

                if ((nx >= 0 && nx < row) && (ny >= 0 && ny < col) && (mat[nx][ny] == -1)) {
                    mat[nx][ny] = val + 1;
                    queue.offer(new int[] { nx, ny });
                }

            }

        }

        return mat;
    }
}