
class Solution {
    static class Pair {
        int xIdx;
        int yIdx;

        public Pair(int xIdx, int yIdx) {
            this.xIdx = xIdx;
            this.yIdx = yIdx;
        }
    }

    public int orangesRotting(int[][] grid) {
        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        int row = grid.length;
        int col = grid[0].length;
        int freshCount = 0;

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        int time = 0 ;

        while(!q.isEmpty() && freshCount > 0){

            int size = q.size() ;

            for(int i = 0 ; i < size ; i++){

                Pair temp = q.poll();

                int xIdx = temp.xIdx;
                int yIdx = temp.yIdx ;
                
                // grid[xIdx][yIdx] = 2;


                for(int j = 0 ; j < directions.length; j++){
                    int nx =  temp.xIdx + directions[j][0];
                    int ny =  temp.yIdx + directions[j][1];

                    if ((nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2 ; 
                        q.offer(new Pair(nx, ny));
                        freshCount--;
                    }
                    
                    
                }

            }

            time++;

        }

        return  freshCount == 0 ? time : -1; 

    }
}
