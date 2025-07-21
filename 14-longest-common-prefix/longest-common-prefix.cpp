class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string longest = strs[0];

        for(int i = 1 ; i < strs.size() ;i++){
            int j = 0 , k = 0 ;
            // longets = "";
            string s = "";
            string match = strs[i];
            while(j < longest.size() && k < match.size()){
                if(longest[j] == match[k]){
                    s.push_back(match[k]);
                }else{
                    break;
                }
                j++;
                k++;
            }
            if(s.size() == 0)return "";

            longest = s ;
        }
        return longest ;
    }
};