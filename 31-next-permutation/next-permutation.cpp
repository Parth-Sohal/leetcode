class Solution {
public:
    void nextPermutation(vector<int>& nums) {

        // in built -->
        // next_permutation(nums.begin(),nums.end());


        // interveiw wala --

        // int n = nums.size();

        // for(int i = n - 2 ; i >= 0 ; i--){
        //     if(nums[i] < nums[i+1]){
        //         reverse(nums.begin()+i+1,nums.end());
        //         swap(nums[i],nums[i+1]);
        //         return ;
        //     }
        // }

        // return sort(nums.begin(),nums.end());


        next_permutation(nums.begin(), nums.end());
    }
};