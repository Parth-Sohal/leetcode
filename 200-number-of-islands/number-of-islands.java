class Solution {

    static class Pair{

        int xIdx ;
        int yIdx;

        Pair(int xIdx,int yIdx){
            this.xIdx=xIdx;
            this.yIdx=yIdx;
        }

    }

    public static int numberOfIsland(char[][] matrix) {

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (!visited[i][j] && matrix[i][j] == '1') {
                    //                    System.out.println(i + " " + j);
                    bsfNoOfIsland(matrix, visited, i, j);
                    count++;
                }

            }
        }

        return count ; 

    }

    private static void bsfNoOfIsland(char[][] matrix, boolean[][] visited, int x, int y) {

        int[][] directions = {
                { 0, -1 }, //left
                { 0, 1 }, // right
                { 1, 0 }, // up
                { -1, 0 } // down
        };

        int col = matrix[0].length;
        int row = matrix.length;

        Pair p = new Pair(x, y);
        visited[x][y] = true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(p);

        while (!q.isEmpty()) {

            Pair temp = q.poll();

            x = temp.xIdx;
            y = temp.yIdx;

            for (int i = 0; i < directions.length; i++) {

                int new_x = x + directions[i][0];
                int new_y = y + directions[i][1];

                if ((new_x >= 0 && new_x < row) && (new_y >= 0 && new_y < col) && (!visited[new_x][new_y])
                        && matrix[new_x][new_y] == '1') {
                    Pair new_p = new Pair(new_x, new_y);
                    visited[new_x][new_y] = true;
                    q.offer(new_p);
                }

            }
            // System.out.println(Arrays.deepToString(visited));

        }

    }

    public int numIslands(char[][] grid) {

        return numberOfIsland(grid) ;

    }
}