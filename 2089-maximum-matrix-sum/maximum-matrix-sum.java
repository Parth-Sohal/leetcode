class Solution {
    public long maxMatrixSum(int[][] matrix) {

        int count = 0;
        int min = Integer.MAX_VALUE;
        int minIdxX = -1;
        int minIdxY = -1;
        long sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }

                if (Math.abs(matrix[i][j]) < min) {

                    min = Math.abs(matrix[i][j]);
                    minIdxX = i;
                    minIdxY = j;
                }

                sum += Math.abs(matrix[i][j]);

            }
        }

        if (count % 2 != 0) {
            sum = sum  -  (2L * Math.abs(matrix[minIdxX][minIdxY]));
        }

        return sum ;
    }
}