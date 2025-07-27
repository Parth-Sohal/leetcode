class Solution {
public:
    void change(vector<vector<int>>& arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    swap(arr[i][j], arr[j][i]);
                }
            }
            reverse(arr[i].begin(), arr[i].end());
        }
    }
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        int n = mat.size();
        bool val = false;
        for (int i = 0; i < 4; i++) {
            change(mat, n);
            if (mat == target) {
                val = true;
                break;
            }
        }
        if(val){
            return true;
        }
        return false;
    }
};