class Solution {
    public static  int minPathSum(int[][] grid , int row , int col ,int[][] dp  ) {

        if(row >=  grid.length || col >= grid[0].length ){
            return Integer.MAX_VALUE ;
        }

        if(row == grid.length-1 && col == grid[0].length-1){
            return grid[row][col];
        }
        
        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        int right = minPathSum(grid,row , col+1 ,dp);
        int down =  minPathSum(grid,row+1 , col , dp);


        return dp[row][col] = Math.min(right,down) + grid[row][col];

    }
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }

        return minPathSum(grid , 0 , 0 , dp) ; 
    }
}