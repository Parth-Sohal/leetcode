class Solution {
    public int orangesRotting(int[][] grid) {

        int[][] dirc = {
                {-1, 0},
                {0, -1}, {1, 0}, {0, 1},
        };

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int fresh = 0 ;
        
        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }

                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        int min = 0 ; 
        
        while(!q.isEmpty() && fresh != 0){
            
            int size =  q.size();
            
            for(int i = 0; i < size; i++){
                
                int[] dir = q.poll();
                
                for(int[] d : dirc){
                    
                    int new_x = dir[0] + d[0];
                    int new_y = dir[1] + d[1];
                    
                    if(new_x >= 0 && new_x < row && new_y >= 0 && new_y < col  && !visited[new_x][new_y] && grid[new_x][new_y] == 1){
                        visited[new_x][new_y] = true;
                        fresh--;
                        q.offer(new int[]{new_x, new_y});
                    }
                    
                }
                
                
            }
            
            min++;
        }
        
        if(fresh == 0){
            return min ;
        }
        
        return -1;


    }
}