class Solution {
    public int longestSubarray(int[] nums) {

        int start = 0 ;
        int n = nums.length ; 
        int countZero = 0 ; 
        int max = 0 ;

        // dyanamic window size

        for(int i = 0 ; i < n ; i++){

            if(nums[i] == 0){

                if(countZero >= 1){

                    while(nums[start] != 0){
                        start++ ;
                    }
                    start++ ;
                }

                countZero++ ;
            }

            max = Math.max(max , i - start) ;
        }

        return max ; 
        
    }
}