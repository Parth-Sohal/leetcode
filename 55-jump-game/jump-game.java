class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length == 1)return true ; 

        int maxReachable = 0 ; 
        int n = nums.length ;

        for(int i = 0 ; i < nums.length; i++){

            maxReachable = Math.max(maxReachable , nums[i] + i) ;

            if( maxReachable == n - 1){
                return true ; 
            }

            if(nums[i] == 0 && maxReachable == i){
                return false ; 
            }



        }
        

        return true ; 
    }
}