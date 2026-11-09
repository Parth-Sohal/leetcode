class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int max = 1 ; 
        int mask = 0 , n = nums.length ; 
        int start = 0  ; 

        for(int i = 0 ; i < n ; i++){

            while((mask & nums[i]) != 0){
                mask ^= nums[start++];
            }

            mask |= nums[i];
            max = Math.max(max , i - start + 1);

        }


        return max ; 


    }
}