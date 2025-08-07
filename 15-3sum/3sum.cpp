class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        // brute kya hota 3 sum hai

        // set<vector<int>> triplets ;
        // int n = nums.size() ;

        // for(int i = 0 ; i < n - 2 ; i++){
        //     for(int j = i+1 ; j < n - 1 ;j++){
        //         for(int k = j+1 ; k < n ; k++){
        //             if(nums[i]+ nums[j]+nums[k] == 0){
        //                 vector<int> triplet = {nums[i],nums[j],nums[k]};
        //                 sort(triplet.begin() , triplet.end()) ;
        //                 triplets.insert(triplet);
        //             }
        //         }
        //     }
        // }
        // return vector<vector<int>>(triplets.begin(),triplets.end());

        sort(nums.begin(), nums.end());
        int n = nums.size();
        set<vector<int>> ans;

        for (int i = 0; i < nums.size() - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    vector<int> triplet = {nums[i], nums[j], nums[k]};
                    ans.insert(triplet);
                    j++;
                    k--;
                }
            }

        }

        return vector<vector<int>>(ans.begin(),ans.end());
    }
};