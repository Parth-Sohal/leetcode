class Solution {
public:
    vector<int> row(vector<vector<int>>& mat) {
        vector<int> m;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat[i].size(); j++) {
                if (mat[i][j] == 0) {
                    m.push_back(i);
                    break;
                }
            }
        }
        return m;
    }

    vector<int> col(vector<vector<int>>& mat) {
        vector<int> n;
        for (int j = 0; j < mat[0].size(); j++) {
            for (int i = 0; i < mat.size(); i++) {
                if (mat[i][j] == 0) {
                    n.push_back(j);
                    break;
                }
            }
        }

        return n;
    }

    void setZeroes(vector<vector<int>>& matrix) {

        vector<int> m = row(matrix);
        vector<int> n = col(matrix);

        int row = matrix.size();
        int col = matrix[0].size();
 

        for (int i = 0; i < m.size(); i++) {
            matrix[m[i]] = vector<int>(col, 0);
        }

        for (int i = 0; i < n.size(); ++i) {
            for (int j = 0; j < row; j++) {
                matrix[j][n[i]] = 0;
            }
        }
    }
};