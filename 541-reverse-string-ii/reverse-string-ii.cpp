class Solution {
public:
    string reverseStr(string s, int k) {
        
        int i = 0 ;
        int j = k-1 ;

        while( j < s.size() ){
            reverse(s.begin() + i , s.begin() + j + 1);
            i = i + (2 * k);
            j = i + k - 1;
        }

        if( i < s.size() ){
            reverse(s.begin() + i ,s.end());
        }

        return s;
    }
};