class Solution {

    public int helper(int[] nums, int goal) {

        if(goal < 0)return 0 ; 

        int total = 0 ;
        int start = 0 ;
        int sum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            sum += nums[i];
            
            while(start <= i && sum > goal){
                sum -= nums[start++];
            }

            total += (i - start + 1);
            
        }
        
        
        return total;
        
    }


    public int numSubarraysWithSum(int[] nums, int goal) {

        return helper(nums , goal) - helper(nums , goal - 1) ; 



    }
}