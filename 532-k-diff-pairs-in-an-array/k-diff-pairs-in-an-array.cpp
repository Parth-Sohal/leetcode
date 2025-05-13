class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int i = 0 ;
        int j = 1 ;
        int count = 0 ;
        while(j < nums.size()){
            // cout << i << " " << j << endl;
            int dif = nums[j]- nums[i];

            if (i == j) {
                j++;
                continue;
            }

            if( dif == k){
                // cout << nums[i] << " "  << nums[j] << endl;
                count++;
                i++;
                j++;
                if(j < nums.size() && nums[j]==nums[j-1]){
                    while(j < nums.size() && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }

            else if(dif > k){
                i++;
            }
            else{
                j++;
                if(j < nums.size() && nums[j]==nums[j-1]){
                    while(j < nums.size() && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }
        }

        return count;
    }
};