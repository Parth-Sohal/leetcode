class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {

        int allow = 0;
        int n = allowed.size();

        for(int i = 0 ; i < n ; i++){
            allow = (allow | (1 << (allowed[i] - 'a'))) ;
        }

        n = words.size() ;
        int count = 0 ;

        for(auto i : words){
            int word = 0 ; 
            for(auto j : i){
                word = (word | (1 << j - 'a'));
            }

            if((word & allow) == word){
                count++;
            }

        }

        return count;


    }
};