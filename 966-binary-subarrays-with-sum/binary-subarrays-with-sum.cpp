class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {

        int prefixSum = 0 ;
        unordered_map<int , int> mpp;

        int count = 0 ;
        mpp[0] = 1;

        for(int i = 0 ; i < nums.size() ;i++){

            prefixSum += nums[i] ;

            auto it = prefixSum - goal ;

            if(mpp.find(it) != mpp.end()){
                count += mpp[it];
            }

            mpp[prefixSum]++;

        }

        return count ;

    }
};