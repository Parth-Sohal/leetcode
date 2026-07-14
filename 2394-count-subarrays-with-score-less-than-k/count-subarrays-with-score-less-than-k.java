class Solution {
    public long countSubarrays(int[] nums, long k) {


        long ans = 0 ; 
        int start = 0 ; 
        long sum = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){

            sum += nums[i] ;

            long prod = sum * (i - start + 1) ;

            while(prod >= k){
                sum -= nums[start++];
                prod = sum * (i - start + 1) ;
            }


            ans += (i - start + 1);

        }

        return ans ; 

        
    }
}