class Solution {
public:
    int majorityElement(vector<int>& nums) {

        int current = nums[0];
        int count = 1 ;

        for(int i = 1 ; i < nums.size() ;i++){
            if(count == 0){
                current = nums[i];
                count = 1 ;
            }
            else if(nums[i] == current) count++;
            else count--;
        }

        return current;

    }
};