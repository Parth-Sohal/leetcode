class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1)return 0 ; 


        int ans = 0 ;
        int n = nums.length ;
        long prod = 1 ; 
        int start = 0 ;


        for(int i = 0 ; i < n ; i++){
            
            prod = prod * nums[i];
            
            while(prod >= k){
                prod = prod / nums[start++];
            }
            
            ans += (i - start + 1);

        }
        
        return ans ; 
    }
}