class Solution {
    public long countSubarrays(int[] nums, long k) {
        
        long ans = 0 ; 
        int start = 0 , n = nums.length ; 
        long currSum = 0 ; 

        for(int i = 0 ; i < n ; i++){

            currSum += nums[i];

            while((currSum * (i - start + 1)) >= k){
                currSum -= nums[start];
                start++;
            }

            ans += (i - start + 1);

        }

        return ans ; 


    }
}