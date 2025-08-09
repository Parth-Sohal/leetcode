class Solution {
public:
    bool satisfiesConditions(vector<vector<int>>& grid) {
        

        int row = grid.size();
        int col = grid[0].size() ;


        for(int i = 0 ; i < col ; i++){   
            for(int j = 1 ; j < row ; j++){
                if(grid[j][i] != grid[j-1][i])return false;
            }
        }


        for(int i = 0 ; i < row ; i++){
            for(int j = 1 ; j < col ; j++){
                if(grid[i][j] == grid[i][j-1])return false ;
            }
        }


        return true;

    }
};