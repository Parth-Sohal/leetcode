class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        
        int present = nums.size() / 3 + 1; 

        unordered_map<int,int> mpp;
        vector<int> ans ;

        for(int i = 0 ; i < nums.size() ;i++){
            mpp[nums[i]]++;

            if(mpp[nums[i]] == present){
                ans.push_back(nums[i]);
            }
        }

        return ans;


    }
};