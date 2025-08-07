class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {

        

        sort(nums.begin(), nums.end());
        
        set<vector<int>> ans;
        int n = nums.size();

        if(n < 4){
            
            return {};
        }


        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = i+1 ; j < nums.size() ;j++){
                int k = j+1;
                int z = n - 1 ; 
                while(k < z){
                    long long sum = (long long)nums[i]+nums[j]+nums[k]+nums[z];
                    if(sum == target){
                        vector<int> res = {nums[i],nums[j],nums[k],nums[z]};
                        ans.insert(res);
                        k++;
                        z--;
                    }
                    else if(sum > target){
                        z--;
                    }else{
                        k++;
                    }
                }
            }
        }

        return vector<vector<int>>(ans.begin(),ans.end());

    }
};