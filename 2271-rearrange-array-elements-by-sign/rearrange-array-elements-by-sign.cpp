class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int i = 0 ; 
        int j = 1;

        vector<int> ans(nums.size()) ; 

        for(int k = 0 ; k < nums.size() ;k++){
            if(nums[k] > 0){
                ans[i] = nums[k];
                i+=2;
            }else
            {
                ans[j] = nums[k];
                j+=2;
            }
        }

        return ans;
    }
};