class Solution {
    public int[][] highestPeak(int[][] isWater) {
        Queue<int[]> q = new LinkedList<>();

        int[][] directions = {
                { 0, -1 },
                { 0, 1 },
                { -1, 0 },
                { 1, 0 }
        };

        int row = isWater.length;
        int col = isWater[0].length;

        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[0].length; j++) {

                if (isWater[i][j] == 1) {
                    isWater[i][j] = 0;
                    q.add(new int[] { i, j });
                } else {
                    isWater[i][j] = -1;
                }

            }
        }

        int dist = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];

                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if ((nx >= 0 && nx < row) && (ny >= 0 && ny < col) && isWater[nx][ny] == -1) {
                        isWater[nx][ny] = dist;
                        q.add(new int[] { nx, ny });
                    }

                }

            }

            dist++;

        }

        return isWater;

    }
}