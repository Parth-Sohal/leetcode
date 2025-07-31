class Solution {
public:
    // vector<int> row(vector<vector<int>>& matrix) {
    //     vector<int> m;
    //     for (int i = 0; i < mat.size(); i++) {
    //         for (int j = 0; j < mat[i].size(); j++) {
    //             if (mat[i][j] == 0) {
    //                 m.push_back(i);
    //                 break;
    //             }
    //         }
    //     }
    //     return m;
    // }

    // vector<int> col(vector<vector<int>>& mat) {
    //     vector<int> n;
    //     for (int j = 0; j < mat[0].size(); j++) {
    //         for (int i = 0; i < mat.size(); i++) {
    //             if (mat[i][j] == 0) {
    //                 n.push_back(j);
    //                 break;
    //             }
    //         }
    //     }

    //     return n;
    // }

    void setZeroes(vector<vector<int>>& matrix) {

        // int row = matrix.size();
        // int col = matrix[0].size() ;

        // vector<int> rowMat(row,0);
        // vector<int> colMat(col , 0);

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < col ; j++){
        //         if(matrix[i][j] == 0){
        //             rowMat[i] = 1;
        //             colMat[j] = 1;
        //         }
        //     }
        // }
        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < col ; j++){
        //         if(rowMat[i] || colMat[j]){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        int row = matrix.size();
        int col = matrix[0].size();
        int col0 = 1;
        int row0 = 1;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(i == 0){
                        row0 = 0;
                    }
                    if(j == 0 ){
                        col0 = 0;
                    }else
                        matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1 ; i < matrix.size() ; i++){
            for(int j = 1 ; j < col ; j++){
                if(matrix[i][j])
                {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
                }
            }
        }

        if(row0 == 0){
            for(int i = 0 ; i < col ;i++){
                matrix[0][i] = 0;
            }
        }

        if(col0 == 0){
            for(int i = 0 ; i < row ; i++){
                matrix[i][0] = 0;
            }
        }
    }
};