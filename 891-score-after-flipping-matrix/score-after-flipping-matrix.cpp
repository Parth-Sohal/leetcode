class Solution {
public:
    int matrixScore(vector<vector<int>>& grid) {

        for (int i = 0; i < grid.size(); i++) { // row
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[i].size(); j++) {
                    grid[i][j] = grid[i][j] ? 0 : 1;
                }
            }
        }
  

        int col = grid[0].size();
        for (int i = 0; i < grid[0].size(); i++) {
            int Zero = 0;
            int one = 0;
            for (int j = 0; j < grid.size(); j++){
                if (grid[j][i] == 0)
                    Zero++;
                else
                    one++;
            }

            if (Zero > one) {
                for (int j = 0; j < grid.size(); j++) {
                    grid[j][i] = grid[j][i] ? 0 : 1;
                }
            }
        }

        int total = 0;
        for (int i = 0; i < grid.size(); i++) {
            int pow = 1;
            int sum = 0;
            for (int j = grid[i].size() - 1; j >= 0; j--) {
                sum += pow * grid[i][j];
                pow = pow * 2;
            }
            total += sum;
        }
        return total;
    }
};
