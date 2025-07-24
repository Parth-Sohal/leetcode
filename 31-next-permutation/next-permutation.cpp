class Solution {
public:
    void nextPermutation(vector<int>& nums) {

        // better stl use kara hai bhaijan
        // next_permutation(nums.begin() , nums.end()) ;

        // optimisig try kari hai

        int n = nums.size();
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            // cout << i << " " << i+1 << endl;
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1)  sort(nums.begin(), nums.end());
    
        else { // next greater element
            int i = n - 1;
            while (i > idx) {
                if (nums[idx] == nums[i] || nums[i] < nums[idx]) {
                    i--;
                } else {
                    swap(nums[i], nums[idx]);
                    reverse(nums.begin() + idx + 1, nums.end());
                    break;
                }
            }
        }
    }
};