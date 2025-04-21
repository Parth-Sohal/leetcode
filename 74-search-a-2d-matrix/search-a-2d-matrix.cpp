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

        // 2 way --
        //  int row = matrix.size()-1;
        //  int col = matrix[0].size()-1;

        // for(int i = 0 ; i < matrix.size() ;i++){
        //     if(matrix[i][0] <= target && matrix[i][col] >= target){
        //         int low = 0;
        //         int high = matrix[i].size()-1;
        //         while(low <= high){
        //             int mid = (low+high)/2;
        //             if(matrix[i][mid] == target){
        //                 return true;
        //             }
        //             else if(matrix[i][mid] > target){
        //                 high = mid - 1;
        //             }
        //             else{
        //                 low = mid + 1;
        //             }
        //         }
        //     }
        // }
        // return false;

        int col = matrix[0].size();
        int start = 0;
        int end = matrix.size() * matrix[0].size() - 1;
        // cout << end;

        while (start <= end) {
            int mid = (start + end) / 2;
            int element = matrix[mid / col][mid % col];

            if (element == target) {
                return true;
            } else if (element > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
};