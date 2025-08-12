class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {

        // hashing method se kaarra hai pur acha se nahi kara
        // map<int, int> hash;
        // int n = nums.size();

        // for (int i = 1; i <= n + 1; i++) {
        //     hash[i] = 0;
        // }

        // for (int i = 0; i < nums.size(); i++) {
        //     if (nums[i] > 0) {
        //         hash[nums[i]]++;
        //     }
        // }

        // for (auto i : hash) {
        //     if (i.second == 0) {
        //         // cout << i.first << " ";
        //         return i.first;
        //         break;
        //     }
        // }
        // return -1;

        // int i = 0;

        // while (i < nums.size()) {
        //     int index = nums[i];
        //     if (index <= 0 || index > nums.size()) {
        //         i++;
        //     } else if (nums[i] == nums[index - 1]) {
        //         i++;
        //     } else {
        //         swap(nums[i], nums[index - 1]);
        //     }
        // }

        // for(int i = 0 ; i < nums.size() ;i++ ){
        //     if(nums[i]!=i+1){
        //         return i+1;
        //     }
        // }
        
        // return nums.size()+1;

        int n = nums.size() ;

        int i =  0 ; 

        while(i < n){
            if(nums[i] <= 0 || nums[i] > n || nums[i] == nums[nums[i] - 1]){
                i++;
            }else{
                swap(nums[i],nums[nums[i]-1]);
            }
        }


        for(int i = 0 ; i < n ; i++){
            if( nums[i] != i+1){
                return i+1;
            }
        }

        return n+1;
    }
};