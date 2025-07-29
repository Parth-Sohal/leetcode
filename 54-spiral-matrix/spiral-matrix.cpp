class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& mat) {
        int left = 0;
        int right = mat[0].size() - 1;
        int top = 0;
        int btm = mat.size() - 1;

        vector<int>ans ; 

        while (left <= right && top <= btm) {
            /// left to right common kya tha top cod lways check by itself
            for (int i = left; i <= right; i++) {
                ans.push_back(mat[top][i]);
            }
            top++;


            // top se botm common right cond always check itself
            for (int i = top; i <= btm; i++) {
                ans.push_back(mat[i][right]) ;
            }
            right--;


            // right tooh left vchaall rahe hai asi common kya hai bottom
            if (top <= btm) {
                for (int i = right; i >= left; i--) {
                    ans.push_back(mat[btm][i]);
                }
            }
            btm--;


            // bottom se top jana my left is the common btw4
            if(left <= right){
                for (int i = btm; i >= top; i--) {
                    ans.push_back(mat[i][left]);
                }
            }
            left++;
        }

        return ans;
    }
};