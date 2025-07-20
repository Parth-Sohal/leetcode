class Solution {
public:
    int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k){ 

        int total = numOnes +  numZeros + numNegOnes ;

        if( k <= numOnes){
            return k;
        }else if(k <= numOnes+numZeros){
            return numOnes ;
        }
        else {
            int ans = total - k ;
            int sub = numNegOnes - ans ;
            return numOnes + (sub * -1);
        }

        return -1;

    }
};