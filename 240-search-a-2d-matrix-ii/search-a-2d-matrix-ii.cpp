class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {

        int row = 0;
        int current = matrix[0].size() - 1;

        int n = matrix.size() - 1;

        // while(row <= n || current >= 0) {
        //     // cout << matrix[row][current] << endl;
        //     // cout << row << " " << current << endl;
        //     if (matrix[row][current] == target) {
        //         // cout << row << " " << current;
        //         // cout << endl;
        //         return true;
        //     }

        //     if (row == n && current == 0) {
        //         // cout << "loop1" << endl;
        //         // cout << "Nahi hai element guys " << endl;
        //         break;
        //     }

        //     else if (row == n) {
        //         // cout << "loop2" << endl;
        //         // cout << "hey here " << endl;
        //         if (matrix[row][current] < target) {
        //             // cout << "no way" << endl;
        //             break;
        //         } else {
        //             current--;
        //         }
        //     } else if (current == 0) {
        //         // cout << "loop3" << endl;
        //         if (matrix[row][current] > target) {
        //             // cout << "no way" << endl;
        //             break;
        //         } else {
        //             row++;
        //         }
        //     }

        //     else if (matrix[row][current] < target) {
        //         // cout << "loop4" << endl;
        //         row++;
        //     } else {
        //         // cout << "loop5" << endl;
        //         current--;
        //     }
        // }

        // return false;


        while(row <= n && current >= 0){
            // cout << matrix[row][current] << endl;
            if(matrix[row][current] == target){
                // cout << row << " " << current << endl;
                return true;
            }
            if(matrix[row][current] < target){
                row++;
            }else{
                current--;
            }
        }

        return false;


    }
};