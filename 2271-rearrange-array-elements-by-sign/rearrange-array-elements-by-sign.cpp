class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int i = 0 ; 
        int j = 1 ;
        vector<int> ans(nums.size());

        for(int k = 0 ; k < nums.size() ; k++){
            int temp = nums[k] ;
            if(temp  > 0){
                ans[i] = temp;
                i+=2;
            }else{
                ans[j] =  temp;
                j+=2;
            }
        }
        return ans;
    }
};