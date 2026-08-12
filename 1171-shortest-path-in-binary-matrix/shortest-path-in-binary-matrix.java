class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        if (grid[0][0] != 0 || grid[row - 1][col - 1] != 0)
            return -1;

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

        int[] start = { 0, 0 };
        int[] end = { row - 1, col - 1 };

        Map<String, String> parent = new HashMap<>();

        Queue<int[]> q = new LinkedList<>();
        q.add(start);
        grid[start[0]][start[1]] = 1;

        while (!q.isEmpty()) {

            int[] idx = q.poll();

            int xIDx = idx[0];
            int yIDx = idx[1];

            //            System.out.print( xIDx + "," + yIDx + " - >");

            if (xIDx == end[0] && yIDx == end[1]) {
                // 
                break;
            }

            for (int[] dir : directions) {

                int newX = idx[0] + dir[0];
                int newY = idx[1] + dir[1];

                if ((newX >= 0 && newX < row) && (newY >= 0 && newY < col) && (grid[newX][newY] == 0)) {

                    String child = newX + "," + newY;
                    String parentKey = xIDx + "," + yIDx;

                    parent.put(child, parentKey);

                    grid[newX][newY] = 1;
                    q.add(new int[] { newX, newY });
                }

            }

        }

        if (grid[end[0]][end[1]] == 0) {
            return -1;
        }

        int count = 0;
        String s = end[0] + "," + end[1];

        while (parent.containsKey(s)) {
            s = parent.get(s);
            count++;
        }

        return count + 1;
    }
}