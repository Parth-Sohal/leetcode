class Solution {
    public int longestNiceSubarray(int[] nums) {

        int start = 0 ; 
        int max = 0 ; 
        int n = nums.length ; 
        int curr = 0;

        for(int i = 0 ; i < n ; i++){

            while((nums[i] & curr) != 0){
             curr ^= nums[start++];
            }

            curr |= nums[i];

            max = Math.max(i-start+1, max);

        }
        return max ; 
    }
}