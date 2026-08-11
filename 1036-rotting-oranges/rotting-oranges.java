class Solution {
    static class Pair {
        int xIdx;
        int yIdx;

        public Pair(int xIdx, int yIdx) {
            this.xIdx = xIdx;
            this.yIdx = yIdx;
        }
    }

    public int orangesRotting(int[][] grid) {
        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        int row = grid.length;
        int col = grid[0].length;
        int freshCount = 0;

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        int count = 0;

        while (!q.isEmpty() && freshCount > 0) {

            int size = q.size();

            for (int j = 0; j < size; j++) {
                Pair temp = q.poll();

                int xIdx = temp.xIdx;
                int yIdx = temp.yIdx;

                for (int i = 0; i < directions.length; i++) {

                    int newXIdx = xIdx + directions[i][0];
                    int newYIdx = yIdx + directions[i][1];

                    if ((newXIdx >= 0 && newXIdx < row && newYIdx >= 0 && newYIdx < col)
                            && grid[newXIdx][newYIdx] == 1) {
                        freshCount--;
                        grid[newXIdx][newYIdx] = 2;
                        q.add(new Pair(newXIdx, newYIdx));
                    }

                }
            }

            count++;

        }

        if (freshCount == 0)
            return count;
        return -1;

    }
}