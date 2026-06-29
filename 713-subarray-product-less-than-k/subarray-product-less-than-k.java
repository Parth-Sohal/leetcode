class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1)return 0 ; 
        
        long prod = 1 ;
        int start = 0 , total = 0 ; 
        
        for(int i = 0 ; i < nums.length ; i++){
            
           prod *= nums[i];
           
           while( prod >= k){
               prod /= nums[start++];
           }
           
           total += (i - start + 1);
            
        }

        return total ; 

    }
}