class Solution {
    public void solve(char[][] board) {

        int[][] directions = {
                { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 }
        };

        int row = board.length, col = board[0].length;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    if (board[i][j] == 'O') {
                        board[i][j] = 'S';
                        q.offer(new int[] { i, j });
                    }
                }

            }
        }

        while (!q.isEmpty()) {

            int[] temp = q.poll();
            int x = temp[0], y = temp[1];

            for (int[] dir : directions) {
                int new_x = x + dir[0];
                int new_y = y + dir[1];

                if (new_x >= 0 && new_x < row && new_y >= 0 && new_y < col && board[new_x][new_y] == 'O') {
                    board[new_x][new_y] = 'S';
                    q.add(new int[] { new_x, new_y });
                }

            }

        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                }

            }

        }

    }
}