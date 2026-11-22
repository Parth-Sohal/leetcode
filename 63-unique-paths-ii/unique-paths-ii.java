class Solution {
    public int uniquePathsWithObstacles(int[][] grid , int row , int col , int[][] dp) {


        if(row >= grid.length || col >= grid[0].length || grid[row][col] == 1){
            return 0 ;
        }

        if(row == grid.length-1 && col == grid[0].length-1){
            return 1;
        }
        
        if(dp[row][col] != -1){
            return dp[row][col];
        }

        return dp[row][col]= uniquePathsWithObstacles(grid,row+1,col, dp) + uniquePathsWithObstacles(grid,row,col+1 , dp);


    }
    public int uniquePathsWithObstacles(int[][] grid) {

        int[][] dp = new int[grid.length][grid[0].length];

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                dp[i][j] = -1;
            }
        }

        return uniquePathsWithObstacles(grid , 0 , 0 , dp);
    }
}