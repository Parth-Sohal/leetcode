class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int start = 0 , n = nums.length ;
        int sum = 0  ;

        int max = Integer.MIN_VALUE ;  

        for(int i = 0 ; i < n ; i++){

            sum += nums[i];

            if(i - start + 1 == k){
                int ans = sum  ; 
                max = Math.max(max , ans);
                sum -= nums[start++];
            }

        }
        
        return (double)max/k ; 
    }
}