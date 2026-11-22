class Solution {
    public int uniquePaths(int row, int col, int rowIdx, int colIdx, int[][] dp) {
        if (rowIdx >= row || colIdx >= col) {
            return 0;
        }

        if (rowIdx == row - 1 && colIdx == col - 1) {
            return 1;
        }

        if (dp[rowIdx][colIdx] != -1) {
            return dp[rowIdx][colIdx];
        }

        return dp[rowIdx][colIdx] = uniquePaths(row, col, rowIdx, colIdx + 1, dp)
                + uniquePaths(row, col, rowIdx + 1, colIdx, dp);

    }

    public  int uniquePaths2(int row, int col ){

        int[][] dp =   new int[row][col];
        
        dp[row-1][col-1] = 1;
        
        for(int i = row - 1 ; i >= 0; i--){
            for(int j = col - 1 ; j >= 0; j--){
                
                if (i == row - 1 && j == col - 1) continue;


                int right = 0 ; 
                int down = 0 ; 
                
                if(j+1 < col){
                    right = dp[i][j+1];
                }
                if(i+1 < row){
                    down = dp[i+1][j];
                }
                
                dp[i][j] = right + down;
                
            }
        }
        
        return dp[0][0];
        
    }

    public int uniquePaths(int m, int n) {
        return uniquePaths2(m,n) ;
    }
}