class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        // int low = 0 ;
        // int high = nums.size() - 1;
        // int ans = nums.size() ;
        // while( low  <= high ){ // lower bound implement lkiya au0r kuch bhi nahi hai
        //     int mid = (low + high)/2;
        //     if(nums[mid] >= target){
        //         ans = mid;
        //         high = mid - 1;
        //     }else{
        //         low = mid + 1;
        //     }
        // }
        // return ans;

        return lower_bound(nums.begin(),nums.end() , target) - nums.begin();
    }
};