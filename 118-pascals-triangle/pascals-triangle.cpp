class Solution {
public:
    vector<vector<int>> generate(int numRows) {

        vector<vector<int>> mat;

        vector<int> ans;
        for (int i = 0; i < numRows; i++) {
            ans.push_back(1);
            mat.push_back(ans);
        }
        for (int i = 2; i < mat.size(); i++) {
            for (int j = 0; j < mat[i].size(); j++) {
                if (j == 0 || j == i)
                    continue;

                else {
                    mat[i][j] = mat[i - 1][j] + mat[i - 1][j - 1];
                }
            }
        }

        return mat ;
    }
};