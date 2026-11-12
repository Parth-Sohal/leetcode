class Solution {
    public int maxInc(int[] nums){

        int  start = 0 ,  n = nums.length  ; 
        int max = 1 ;

        for(int i = 1 ; i < n  ; i++){

            if(nums[i] <= nums[i-1]){
                start = i ;
            }

            max = Math.max(i - start + 1, max);

        }

        return max ; 

    }

    public int minInc(int[] nums){

        int  start = 0 ,  n = nums.length  ; 
        int max = 1 ;

        for(int i = 1 ; i < n  ; i++){

            if(nums[i] >= nums[i-1]){
                start = i ;
            }

            max = Math.max(i - start + 1, max);

        }

        return max ; 

    }


    public int longestMonotonicSubarray(int[] nums) {
        return Math.max(maxInc(nums) , minInc(nums));
    }
}