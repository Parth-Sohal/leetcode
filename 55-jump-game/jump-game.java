class Solution {
    public boolean canJump(int[] nums) {
        
        int maxJumps = 0 , n = nums.length ; 

        for(int i = 0; i < n ; i++){

            if(i > maxJumps){
                return false;
            }


            maxJumps = Math.max(i+nums[i] , maxJumps);

            if(maxJumps >= n - 1){
                return true ;
            }


        }


        return true ; 

    }
}