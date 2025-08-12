class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        // nums ka size kya hai n+1 original kya hona chaiya tha n
        // elements kaha se kaha taak 1 - n aur size n+1 mtlb sabhi lement ek
        // index ko point kaar ra honge

        // phele sorting kitya

        // -ve index marking array modified
        // for(int i= 0 ; i < nums.size() ;i++){
        //     if(nums[abs(nums[i])] > 0){
        //         nums[abs(nums[i])] = -1 * nums[abs(nums[i])];
        //     }
        //     else{
        //         return abs(nums[i]);
        //     }
        // }

        // return -1;

        // int i = 0;

        // while (i < nums.size()) {
        //     if ((nums[i] > 0 && nums[i] < nums.size()) &&
        //         (nums[i] != nums[nums[i]])) {
        //         swap(nums[i], nums[nums[i]]);
        //     } else {
        //         i++;
        //     }
        // }

        // return nums[0];


        int n = nums.size() ;
        int i = 0 ;

        while(i<n){
            if(nums[i] == nums[nums[i] - 1]){
                i++;
            }
            else{
                swap(nums[i],nums[nums[i]-1]);
            }
        }


        for(int i = 0 ; i < n ; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }

        return -1;
        
 
    }
};