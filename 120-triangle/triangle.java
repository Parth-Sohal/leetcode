class Solution {
        public  static int minimumTotal(List<List<Integer>> triangle , int row , int col , int[][] dp) {


        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }


        int next = minimumTotal(triangle,row +1 , col, dp);
        int adjectNext = minimumTotal(triangle , row+1,col+1,dp);


        return dp[row][col] = Math.min(next,adjectNext) + triangle.get(row).get(col);


    }

    public int minimumTotal(List<List<Integer>> triangle) {
         int[][]  dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];

        for(int i=0;i<triangle.get(triangle.size()-1).size();i++){
            for(int j=0;j<triangle.get(triangle.size()-1).size();j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        return (minimumTotal(triangle,0,0,dp));
    }
}