class Solution {

    public char[][] intToCharBoard(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = (arr[i][j] == 0) ? '.' : (char) (arr[i][j] + '0');
            }
        }
        return board;
    }

    public boolean sudoku(int currRow, int currCol, int[][] arr, int[][] rows, int[][] cols, int[][] mat) {

        if (currRow == 9) {

            return true;
        }

        boolean ans = false;

        if (!ans && arr[currRow][currCol] != 0) {

            // just move forward

            if (currCol == 8) {
                ans = sudoku(currRow + 1, 0, arr, rows, cols, mat);
            }

            else {
                ans = sudoku(currRow, currCol + 1, arr, rows, cols, mat);
            }

        }

        else {

            // few cond

            for (int i = 1; i <= 9; i++) {

                if (rows[currRow][i] != 0) {
                    continue;
                }

                if (cols[currCol][i] != 0) {
                    continue;
                }

                int firstIdx;

                if (currRow <= 2) {
                    firstIdx = 0;
                }

                else if (currRow <= 5) {
                    firstIdx = 3;
                }

                else {
                    firstIdx = 6;
                }

                if (currCol <= 2) {
                    firstIdx += 0;
                } else if (currCol <= 5) {
                    firstIdx += 1;
                } else {
                    firstIdx += 2;
                }

                if (mat[firstIdx][i] != 0) {
                    continue;
                }

                arr[currRow][currCol] = i;
                rows[currRow][i] = i;
                cols[currCol][i] = i;
                mat[firstIdx][i] = i;

                if (currCol == 8) {
                    ans = sudoku(currRow + 1, 0, arr, rows, cols, mat);
                }

                else {
                    ans = sudoku(currRow, currCol + 1, arr, rows, cols, mat);
                }

                if (ans) {
                    return ans;
                }

                arr[currRow][currCol] = 0;
                rows[currRow][i] = 0;
                cols[currCol][i] = 0;
                mat[firstIdx][i] = 0;

            }

        }

        return ans;

    }

    public void solveSudoku(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = board[i][j] - '0';
                }
            }
        }

        int[][] rows = new int[arr.length][arr[0].length + 1];
        int[][] cols = new int[arr.length][arr[0].length + 1];
        int[][] matx = new int[arr.length][arr[0].length + 1];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 0) {
                    continue;
                }

                int val = arr[i][j];
                rows[i][val] = val;

            }
        }

        // cols ka dekhna padega

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {

                //                System.out.print(arr[j][i] + " ");
                int val = arr[j][i];
                cols[i][val] = val;

            }
            //            System.out.println( " " + Arrays.toString(cols[i]));
        }

        // each dabba also done now

        for (int i = 0; i < arr.length; i++) {

            int firstIdx;

            if (i <= 2) {
                firstIdx = 0;
            }

            else if (i <= 5) {
                firstIdx = 3;
            }

            else {
                firstIdx = 6;
            }

            for (int j = 0; j < arr[0].length; j++) {

                if (j <= 2) {

                    //                    System.out.print((firstIdx+0) + "  ");

                    matx[firstIdx][arr[i][j]] = arr[i][j];

                } else if (j <= 5) {
                    //                    System.out.print(firstIdx+1 + "  ");

                    matx[firstIdx + 1][arr[i][j]] = arr[i][j];

                } else {
                    //                    firstIdx += 2;
                    //                    System.out.print(firstIdx+2 + "  ");

                    matx[firstIdx + 2][arr[i][j]] = arr[i][j];

                }

            }

        }

        sudoku(0, 0, arr, rows, cols, matx);

        char[][] solved = intToCharBoard(arr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = solved[i][j];
            }
        }

    }
}