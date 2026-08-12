class Solution {

    public void dfsIsland(
        char[][] grid , 
        int[][] directions ,
         int x , int y
    ){


        grid[x][y] = '0' ; // visited

        for(int i = 0 ; i <  directions.length ; i++){

            int newX = x + directions[i][0];
            int newY = y + directions[i][1] ;

            if(
                (newX >= 0  && newX < grid.length) &&
                (newY >= 0 && newY < grid[0].length ) 
                && (grid[newX][newY] == '1')
            ){
               dfsIsland(grid , directions , newX , newY) ; 
            }

        }


    }


    public int numIslands(char[][] grid) {

        int[][] directions = {
            {0,-1} , {0,1} , {-1,0} , {1,0} 
        } ;

        int count = 0 ; 

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                
                if(grid[i][j] == '1'){
                    count++;
                    dfsIsland(grid , directions , i , j ) ;
                }


            }
        }

        return count ; 


        
    }
}