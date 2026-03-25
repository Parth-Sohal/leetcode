class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = 0 ;

        for(int[] i : grid){
            sum += Arrays.stream(i).sum() ;
        }

        // horizontal cut

        if(sum % 2 != 0)return false ; 
        long ans = sum / 2 ; 

        long currSum = 0 ;
        for (int i = 0; i < grid.length - 1; i++) {
            for(int j = 0 ; j < grid[0].length ; j++){
                currSum += grid[i][j];
            }

            if(currSum == ans ){
                return true ;
            }

        }


        // vertical code 
        currSum = 0 ;
        for(int i = 0 ; i < grid[0].length  - 1; i++){
            for(int j = 0 ; j < grid.length ; j++){
                currSum += grid[j][i];
            }

            if(currSum == ans){
               return true ; 
            }
        }

        return false ; 
    }
}