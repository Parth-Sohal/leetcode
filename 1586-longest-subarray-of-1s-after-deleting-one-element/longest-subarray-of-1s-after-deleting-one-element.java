class Solution {
    public int longestSubarray(int[] nums) {

        int max = 0 ; 
        int k = 1 , n = nums.length ; 
        int start = 0 ;
        
        for(int i = 0 ; i < n ; i++){

            if(nums[i] == 0){

                while(k == 0){

                    if(nums[start++] == 0){
                        k++;
                    }

                }

                k--;


            }

            max = Math.max(i - start , max);

        }

        return max ; 

    }
}