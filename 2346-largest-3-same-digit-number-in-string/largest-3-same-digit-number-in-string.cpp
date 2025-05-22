class Solution {
public:
    string largestGoodInteger(string num) {
        int i = 0;
        int j = num.size();

        string ans = "";

        for(int i = 0 ; i < j-2 ;i++){
            if(num[i] == num[i+1] && num[i] == num[i+2]){
                string current = num.substr(i,3);
                    if(current > ans){
                        ans = current;
                    }
            }
            
        }
        return ans;
    }
};