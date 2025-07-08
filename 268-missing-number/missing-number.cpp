class Solution {
public:
    int missingNumber(vector<int>& nums) {

        // sort(nums.begin() , nums.end()) ;

        // for(int i = 0 ; i < nums.size() ;i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }

        // return nums.size();

        int n = nums.size();
        // cout << n << endl;
        int total = ((n) * (n + 1)) / 2;
        int sum = accumulate(nums.begin(), nums.end(), 0);

        return total - sum;

        // int xor1 = 0 ;
        // int xor2 = 0 ;

        // for(int i = 0 ; i < nums.size() ;i++){
        //     xor1 = xor1 ^ (i+1);
        //     xor2 = xor2 ^ (nums[i]);
        // }

        // return xor1 ^ xor2 ;
    }
};