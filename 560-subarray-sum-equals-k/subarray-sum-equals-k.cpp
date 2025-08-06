class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int count = 0 ;
        int n = nums.size();


        // brtue tha 
        // for(int i = 0 ; i < n ; i++){
        //     int sum = 0 ;
        //     for(int j = i ; j < n ; j++){
        //         sum += nums[j] ;
        //         if(sum == k)  count++;
        //     }
        // }


        unordered_map<int,int> mpp;
        int sum = 0 ;
        mpp[0] = 1 ;

        for(int i = 0 ; i < n ; i++){

            sum += nums[i];

            int result = sum - k ;
            if(mpp.find(result) != mpp.end()){
                count+=mpp[result];
            }

            mpp[sum]++;
        }


        
        
        return count;
    }
};