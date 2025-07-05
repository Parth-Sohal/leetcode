class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int maxProfit = 0 ; 

        int currentStock = prices[0];

        // sabse chote no se ho profit milega 
        // profit ko maxmize karna pur peecha nahi jana


        for(int i = 1 ; i < prices.size() ;i++){
            if(prices[i] < currentStock){ // biuying the smallest stock 
                currentStock = prices[i];
            }

            else{ // bechna kaab hai jab profit mille
                int profit = prices[i] - currentStock;
                maxProfit = max(profit , maxProfit);
            }
        }


        return maxProfit;

    }
};