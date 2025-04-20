class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        /// basic linear search
        // for(int i = 0 ; i <  matrix.size() ;i++){
        //     for(int j = 0 ; j < matrix[i].size() ;j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        int row = matrix.size()-1;
        int col = matrix[0].size()-1;

        for(int i = 0 ; i < matrix.size() ;i++){
            if(matrix[i][0] <= target && matrix[i][col] >= target){
                int low = 0;
                int high = matrix[i].size()-1;
                while(low <= high){
                    int mid = (low+high)/2;
                    if(matrix[i][mid] == target){
                        return true;
                    }
                    else if(matrix[i][mid] > target){
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }
                }
            }
        }
        return false;
    }
};