class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        int[][] prfMat = new int[grid.length][grid[0].length];


        for(int i = 0;  i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                grid[i][j] = grid[i][j]%12345;
            }
        }

        int prd = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                prfMat[i][j] = prd % 12345;
                prd = (prd * grid[i][j]) % 12345;
            }
        }

        prd = 1;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                prfMat[i][j] = (prd * prfMat[i][j]) % 12345 ;
                prd = (prd * grid[i][j]) % 12345;
            }
        }

        return prfMat ;
    }
}