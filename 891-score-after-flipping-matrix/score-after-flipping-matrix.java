class Solution {
    public int matrixScore(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        // Step 1: Ensure the first column of every row is 1
        for (int i = 0; i < row; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < col; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        
        // Step 2: For each column from 1 to col-1, maximize the number of 1s
        for (int j = 1; j < col; j++) {
            int countOnes = 0;
            for (int i = 0; i < row; i++) {
                if (grid[i][j] == 1) {
                    countOnes++;
                }
            }
            
            // If zeros are more than ones, toggle the column
            if (countOnes < row - countOnes) {
                for (int i = 0; i < row; i++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        
        // Step 3: Calculate the total score
        int totalScore = 0;
        for (int i = 0; i < row; i++) {
            int rowValue = 0;
            for (int j = 0; j < col; j++) {
                rowValue = (rowValue << 1) + grid[i][j];
            }
            totalScore += rowValue;
        }
        
        return totalScore;
    }
}