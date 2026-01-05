class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }

            }

        }

        for (int[] i : matrix) {
            int a = 0;
            int b = i.length - 1;

            while (a < b) {
                int temp = i[a];
                i[a] = i[b];
                i[b] = temp;
                a++;
                b--;
            }

        }
    }
}