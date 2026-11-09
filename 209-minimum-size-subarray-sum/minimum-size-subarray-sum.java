class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length ; 
        int min = Integer.MAX_VALUE ; 

        int currSum = 0 ; 
        int start = 0 ; 


        for(int i = 0 ; i < n ; i++){

            currSum += nums[i] ;


            while(currSum >= target){
                min = Math.min(i - start + 1, min);
                currSum -= nums[start++];                
            }

        }

        return min == Integer.MAX_VALUE ? 0 : min;

    }
}