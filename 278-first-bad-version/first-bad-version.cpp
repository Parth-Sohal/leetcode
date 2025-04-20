// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
       int low = 1;
       int high = n;
       int ans = -1;

       while(low <= high){
        int mid = low + (high - low )/2;
        int val = isBadVersion(mid);
        if(val == 0){
            low = mid + 1;
        }
        else{
            ans = mid;
            high = mid - 1;
        }
       } 
       return ans;
    }
};