class Solution {
public:
    bool isPerfectSquare(int num) {
        long low = 1 ;
        long high = num;

        while(low <= high){
            long mid = low + (high - low)/2;
            if(mid*mid  == num){
                return true;
            }
            if(mid*mid > num){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
};