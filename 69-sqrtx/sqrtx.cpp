class Solution {
public:
    int mySqrt(int x) {
        long low = 1;
        long high = x;
        long ans ;
        while(low<=high)
        {
           long mid = (low+high)/2;
           if(mid * mid == x){
            return mid;
           } 
           if(mid * mid > x){
            high = mid - 1;
           }
           else{
            ans = mid ;
            low = mid + 1;
           }
        }
        return ans;        
    }
};