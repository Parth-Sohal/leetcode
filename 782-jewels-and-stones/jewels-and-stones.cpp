class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        
        unordered_map<char,int> freq ;

        for(int i = 0 ; i < jewels.size() ; i++){
            freq[jewels[i]] = 1;
        }

        int count = 0 ;

        for(int i = 0 ; i < stones.size() ;i++){
            if(freq[stones[i]] == 1){
                count++;
            }
        }

        return count ; 

    }
};