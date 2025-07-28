class Solution {
public:
    
    void rotate90Deg(vector<vector<int>>& mat){
        for(int i = 0 ; i < mat.size()  ;i++){ // rows
            for(int j = i+1 ; j < mat[i].size() ; j++){
                swap(mat[i][j] , mat[j][i]);
            }
            reverse(mat[i].begin() , mat[i].end());
        }
    }


    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        if(mat == target) return true;

        for(int i = 0 ; i < 3 ; i++){
            rotate90Deg(mat) ;
            if(mat == target)return true ;
        }

        return false;

    }
};