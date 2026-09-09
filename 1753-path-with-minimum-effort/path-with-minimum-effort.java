class Solution {
    static class Pair {

        int x;
        int y;
        int maxEfforts;

        Pair(int x, int y, int maxEfforts) {
            this.x = x;
            this.y = y;
            this.maxEfforts = maxEfforts;
        }

    }

    public int minimumEffortPath(int[][] heights) {
        int row = heights.length, col = heights[0].length;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.maxEfforts, b.maxEfforts));

        int[][] directions = {
                { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 }
        };

        pq.add(new Pair(0, 0, 0));

        int[][] efforts = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                efforts[i][j] = Integer.MAX_VALUE;
            }
        }

        efforts[0][0] = 0;

        while (!pq.isEmpty()) {

            Pair p = pq.poll();

            int x = p.x;
            int y = p.y;

            for (int[] direction : directions) {

                int newX = x + direction[0];
                int newY = y + direction[1];

                if ((newX >= 0 && newX < row) && (newY >= 0 && newY < col)) { // valid

                    int newEffort = Math.max(p.maxEfforts, Math.abs(heights[newX][newY] - heights[x][y]));

                    if (newEffort < efforts[newX][newY]) {
                        efforts[newX][newY] = newEffort;
                        pq.offer(new Pair(newX, newY, newEffort));
                    }

                }

            }

        }

        return efforts[row-1][col-1] ;
    }
}