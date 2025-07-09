class Solution {
public:
    int removeDuplicates(vector<int>& nums) {

        int i = 1 ;
        int j = 1 ; 

        int count = 1;
        int current = nums[0];

        while( j < nums.size() ){

            if(nums[j] == current && count < 2){
                count++;
                nums[i] = nums[j];
                i++;
            }
            else if(nums[j] != current){
                count= 1 ; 
                nums[i] = nums[j];
                i++;
                current = nums[j];
            }
            j++;
        }

        return i ;

    }
};