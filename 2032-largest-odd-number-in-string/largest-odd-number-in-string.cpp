class Solution {
public:
    string largestOddNumber(string num) {
        int l = num.size();
        int ans = -1;
        for(int i = l - 1 ; i>=0 ;i--){
            if(num[i]%2!=0){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            return "";
        }
        return num.substr(0,ans+1);
    }
};