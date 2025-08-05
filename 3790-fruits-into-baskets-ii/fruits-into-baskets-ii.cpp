class Solution {
public:
    int numOfUnplacedFruits(vector<int>& fruits, vector<int>& baskets) {
        
        int total = 0 ;

        for(int i = 0 ; i < fruits.size() ; i++){
            bool flag = true;
            for(int j = 0 ; j < baskets.size() ; j++){
                if(baskets[j] >= fruits[i]){
                    baskets[j] = -1;
                    flag = false;
                    break;
                }
            }
            if(flag)total++;
        }    
        return total;
    }
};