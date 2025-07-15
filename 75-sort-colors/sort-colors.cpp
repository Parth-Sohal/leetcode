class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        // method one  i will count 0 , 1 and 2 and explitclity put in poo

        int countZero = 0 ;
        int countOne = 0 ;
        int countTwo = 0 ;


        for(int i = 0 ; i < nums.size() ;i++){
            if(nums[i] == 0){
                countZero++;
            }else if(nums[i] == 1){
                countOne++;
            }else{
                countTwo++;
            }
        }

        for(int i = 0 ; i < nums.size() ;i++){
            if( i < countZero){
                nums[i] = 0;
            }else if( i < countZero + countOne){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }


    }
};