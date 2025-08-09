class Solution {
public:
    string reverseWords(string s) {
        

        int i = 0 ;
        while( i < s.size() ){

            if(s[i] == ' '){
                i++;
            }

            else {
                int start = i ;
                while(s[i] != ' ' && i < s.size()){
                    i++;
                }
                reverse(s.begin()+start , s.begin() + i);
            }
        
        }

        return s;


    }
};