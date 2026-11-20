class Solution {
    public int maxFrequency(int[] nums, int k) {

        // sliding window 

        Arrays.sort(nums);

        int n = nums.length ; 
        int start = 0 ; 
        int max = 1 ; 
        long currSum = 0;

        for(int i = 0  ; i < n ; i++){

            currSum += nums[i];
            
            while( (long) nums[i] * (i - start + 1) - currSum > k ) {
                currSum -= nums[start++];
            }


            max = Math.max(max , i-start+1);

        }

        return max ; 

        
    }
}