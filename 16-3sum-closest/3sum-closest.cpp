class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        
        sort(nums.begin(),nums.end());
        int n = nums.size();

        int unit = INT_MAX ;
        int ans = -1;


        for(int i =  0 ; i < nums.size()-2 ;i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                
                int sum = nums[i]+nums[j]+nums[k];  
                if(sum == target) return target;

                int u = abs(sum - target);
                if(u < unit){
                    ans = sum;
                    unit = u;
                    // j++;
                    // k--;
                }

                else if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        } 

        return ans;   

    }
};