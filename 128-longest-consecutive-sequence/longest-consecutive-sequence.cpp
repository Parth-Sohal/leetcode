class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size() == 0){
            return 0;
        }
        sort(nums.begin(),nums.end());
        int maxCount = 1 ;
        int count = 1;

        for(int i = 1 ; i < nums.size() ;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                count++;
            }else{
                count = 1;
            }
            maxCount = max(count,maxCount);
        }

        return maxCount;
    }
};