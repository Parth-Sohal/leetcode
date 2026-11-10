class Solution {

    public int atMostK(int[] nums , int k){

        if(k < 0)return 0 ; 

        int count = 0 ; 
        int ans = 0 ; 
        int n = nums.length ;
        int start = 0 ; 

        for(int end = 0 ; end < n ; end++){
            
            if(nums[end] % 2 != 0){
                count++;
            }

            while(count > k){
                if(nums[start++] % 2 != 0)count--;
            }

            ans += (end - start + 1);
        }

        return ans ; 


    }

    public int numberOfSubarrays(int[] nums, int k) {
        
        // atmost k 

        return atMostK(nums , k) - atMostK(nums , k - 1) ;

    }
}