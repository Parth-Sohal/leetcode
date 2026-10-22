class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int currX = 0, currY = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        // System.out.println(Arrays.deepToString(visited));

        int row = grid.length, col = grid[0].length;
        visited[currX][currY] = true;

        while (true) {

            char ch = grid[currX][currY];

            if (ch == 'R') {

                if (currY + 1 >= col || visited[currX][currY + 1]) {
                    return new int[] { currX, currY  };
                }

                currY++;

            }

            else if (ch == 'L') {

                if (currY - 1 < 0 || visited[currX][currY - 1]) {
                    return new int[] { currX, currY  };
                }

                currY--;

            }

            else if (ch == 'D') {

                if (currX + 1 >= row || visited[currX + 1][currY]) {
                    return new int[] { currX , currY };
                }

                currX++;
            }

            else if (ch == 'U') {

                if (currX - 1 < 0 || visited[currX - 1][currY]) {
                    return new int[] { currX , currY };
                }

                currX--;

            }

            visited[currX][currY] = true;
        }

    }
}