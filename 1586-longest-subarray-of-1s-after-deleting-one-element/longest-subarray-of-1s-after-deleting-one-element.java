class Solution {
    public int longestSubarray(int[] nums) {

        int zero = 0 ;
        int start = 0 ; 
        int max = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == 0){

                if(zero == 0){
                    zero++;
                }

                else{
                    while(nums[start] != 0){
                        start++;
                    }
                    start++;
                }

            }

            max = Math.max(max , i - start);

        }


        return max ; 

        
    }
}