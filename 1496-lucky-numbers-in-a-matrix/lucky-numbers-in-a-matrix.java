class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int[] rowArr = new int[row];
        int[] colArr = new int[col];

        for (int i = 0; i < row; i++) {
            int min = Integer.MAX_VALUE; // Change from MIN_VALUE to MAX_VALUE
            for (int j = 0; j < col; j++) {
                min = Math.min(matrix[i][j], min); // Use Math.min instead of Math.max
            }
            rowArr[i] = min;
        }

        for (int i = 0; i < col; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            colArr[i] = max;
        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == rowArr[i] && matrix[i][j] == colArr[j]) {
                    list.add(matrix[i][j]);
                }

            }

        }

        return list;

    }
}