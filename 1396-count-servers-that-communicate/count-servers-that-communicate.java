class Solution {
    public int countServers(int[][] grid) {
        
        int row = grid.length , col = grid[0].length , ans = 0  ;

        int[] rowArr = new int[row];
        int[] colArr = new int[col] ;



        for(int i = 0 ; i < row; i++){

            for(int j = 0 ; j < col ; j++){

                if(grid[i][j] == 1){
                    rowArr[i]++;
                    colArr[j]++;
                } 

            }

        }


        for(int i = 0 ; i < row; i++){

            for(int j = 0 ; j < col ; j++){

            if(grid[i][j] == 1 && (rowArr[i] > 1 || colArr[j] > 1)){
                   ans++;
                } 

            }

        }

        return ans; 

    }
}