class Solution {
public:
    int factorail(int n) {
        if (n == 0)
            return 1;
        return n * factorail(n - 1);
    }

    int combination(int n, int r) {
        return factorail(n) / (factorail(n - r) * factorail(r));
    }

    vector<vector<int>> generate(int numRows) {

        vector<vector<int>> mat;

        // vector<int> ans;
        // for (int i = 0; i < numRows; i++) {
        //     ans.push_back(1);
        //     mat.push_back(ans);
        // }
        // for (int i = 2; i < mat.size(); i++) {
        //     for (int j = 0; j < mat[i].size(); j++) {
        //         if (j == 0 || j == i)
        //             continue;

        //         else {
        //             mat[i][j] = mat[i - 1][j] + mat[i - 1][j - 1];
        //         }
        //     }
        // }

        // for (int i = 0; i < numRows ; i++) {
        //     vector<int> ans;
        //     for (int j = 0; j <= i; j++) {
        //         ans.push_back(combination(i, j));
        //     }
        //     mat.push_back(ans);
        // }


        for(int i = 0 ; i < numRows ; i++){
            int current = 1 ;
            vector<int> row;
            for(int j = 0 ; j <= i ; j++){
                row.push_back(current);
                current = current * (i - j) / ( j + 1);
            }
            mat.push_back(row);
        }


        return mat;
    }
};