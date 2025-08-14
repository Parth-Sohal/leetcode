class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {

        int arr[26] = {0};
        int n = allowed.size() ;

        for(int i = 0 ; i < n ; i++){
            arr[allowed[i] - 'a']++;
        }

        int count = 0 ;
        n = words.size();

        for(int i = 0 ; i < n ;i++){
            bool allow = true;
            for(int j = 0 ; j < words[i].size() ;j++){
                if(arr[words[i][j] - 'a'] == 0){
                    allow =  false ;
                    break;
                }
            }
            if(allow)count++;
        }

        return count;


    }
};