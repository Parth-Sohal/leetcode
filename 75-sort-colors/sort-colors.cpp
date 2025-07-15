class Solution {
public:

    void dutchFlag(vector<int>& nums){
        int low = 0 ;
        int high = nums.size() - 1 ;
        int i = 0 ;

        while( i <= high){
            if(nums[i] == 1){
                i++;
            }

            else if(nums[i] == 0){
                swap(nums[low] , nums[i]);
                low++;
                i++;
            }

            else{
                swap(nums[high],nums[i]);
                high--;
            }
        }
    }

    void sortColors(vector<int>& nums) {
        
        // method one  i will count 0 , 1 and 2 and explitclity put in poo

        // int countZero = 0 ;
        // int countOne = 0 ;
        // int countTwo = 0 ;


        // for(int i = 0 ; i < nums.size() ;i++){
        //     if(nums[i] == 0){
        //         countZero++;
        //     }else if(nums[i] == 1){
        //         countOne++;
        //     }else{
        //         countTwo++;
        //     }
        // }
        // for(int i = 0 ; i < nums.size() ;i++){
        //     if( i < countZero){
        //         nums[i] = 0;
        //     }else if( i < countZero + countOne){
        //         nums[i] = 1;
        //     }else{
        //         nums[i] = 2;
        //     }
        // }

            // method 2 
            // i pointer jo vhalewg a high se age 2 low se phel 0 

        dutchFlag(nums);


    }
};