class Solution {
public:
    int rearrangeCharacters(string s, string target) {
        unordered_map<char,int> mpp1;
        unordered_map<char,int> mpp2;

        for(int i = 0 ; i < target.size() ;i++){
            mpp1[target[i]]++;
            mpp2[target[i]] = 0;
        }


        
        for(int i = 0 ; i < s.size() ;i++){
            if(mpp1.find(s[i]) != mpp1.end()){
                mpp2[s[i]]++;
            }
        }

        int minVal = INT_MAX;

        for(auto it : mpp2){
            int val  = it.second / mpp1[it.first];
            if(val == 0) {
                return 0;
            }
            minVal = min(minVal,val);
        }

        return minVal ;
        

    }
};