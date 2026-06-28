class Solution {
    public int longestSubarray(int[] nums) {

        int start = 0 ;
        int n = nums.length ; 
        int countZero = 0 ; 
        int max = 0 ;

        // dyanamic window size

        for(int i = 0 ; i < n ; i++){

            if(nums[i] == 0){
                countZero++ ;
            }

            if(countZero > 1){
                if(nums[start]== 0)countZero-- ;
                start++;
            }

            if(countZero <= 1)max = Math.max(max , i - start) ;
        }

        return max ; 
        
    }
}