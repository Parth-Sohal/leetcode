class Solution {
public:
    int maxPower(string s) {
        int count = 1 ;
        int maxCount = 1;

        for(int i = 1 ; i < s.size() ;i++){
            if(s[i] == s[i-1]){
                count++;
            }else{
                count = 1;
            }
            maxCount = max(maxCount,count);
        }

        return maxCount ;
    }
};