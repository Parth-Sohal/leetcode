class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int start = 0 , n = nums.length ;
        double sum = 0  ;

        double max = Integer.MIN_VALUE ;  

        for(int i = 0 ; i < n ; i++){

            sum += nums[i];

            if(i - start + 1 == k){
                double ans = sum / k ; 
                max = Math.max(max , ans);
                sum -= nums[start++];
            }

        }
        
        return max ; 
    }
}