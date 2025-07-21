class Solution {
public:
    int maxNumberOfBalloons(string text) {
        unordered_map<char,int> mpp;
        mpp['b'] = 0;
        mpp['a'] = 0;
        mpp['l'] = 0;
        mpp['o'] = 0;
        mpp['n'] = 0;

        for(int i = 0 ; i <  text.size() ;i++){
            if(mpp.find(text[i]) != mpp.end()){
                mpp[text[i]]++;
            }
        }

        mpp['l'] = mpp['l']/2;
        mpp['o'] = mpp['o']/2;

        int minVal = INT_MAX ;

        for(auto it : mpp){
            minVal = min(it.second, minVal); 
        }

        return minVal ;



    }
};