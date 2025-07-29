class Solution {
public:
    vector<int> getRow(int rowIndex) {

        vector<int> ans;

        long current  = 1 ;

        for(int i = 0 ; i <= rowIndex ; i++){
            ans.push_back(current);
            current = current * (rowIndex - i)/(i + 1);
        }

        return ans;

        
    }

};