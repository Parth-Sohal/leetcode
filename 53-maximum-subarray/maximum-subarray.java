class Solution {
    public int maxSubArray(int[] nums) {

        // brute o(n2) cgheck each subbarray 

        // optimize O(n) kadane algorithm

        int sum = 0 ; 
        int max = Integer.MIN_VALUE ;

        for(int i : nums){
            sum += i ;

            max = Math.max(sum , max);

            if(sum < 0){
                sum = 0 ;
            }

        }
        

        return max ; 
    }
}