class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        
        int present = nums.size() / 3; 

        unordered_map<int,int> mpp;
        
        set<int> set;

        for(int i = 0 ; i < nums.size() ;i++){
            mpp[nums[i]]++;

            if(mpp[nums[i]] > present){
                set.insert(nums[i]);
            }
        }

        return vector<int>(set.begin(),set.end());
    }
};