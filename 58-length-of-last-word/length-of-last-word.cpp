class Solution {
public:
    int lengthOfLastWord(string s) {
        int l = s.size();
        int i = l-1;
        int count = 0;

        while(i >= 0){
            if(s[i] == ' '){
                i--;
            }
            else{
                while(i>=0 && s[i]!=' '){
                    count++;
                    i--;
                }
                break;
            }
        }
        return count ;
    }
};