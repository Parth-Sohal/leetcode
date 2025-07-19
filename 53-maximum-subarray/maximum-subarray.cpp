class Solution {
public:
    int maxSubArray(vector<int>& nums) {

        // why greedy subarray is contigounus opart 

        int maxSum = INT_MIN;
        int sum = 0 ;
        int i = 0 ;

        while(i < nums.size()){
            sum += nums[i];
            maxSum = max(sum,maxSum) ;

            if(sum < 0){
                sum = 0;
            }
            i++;
        }

        return maxSum;


    }
};