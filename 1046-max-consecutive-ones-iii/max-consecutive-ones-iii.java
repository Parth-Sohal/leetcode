class Solution {
    public int longestOnes(int[] nums, int k) {

        int max = 0 ; 
        int n = nums.length ; 
        int start = 0 ; 

        // 1 skip 
        
        // 0 -> 
        // k > 0 
        // 

        for(int i = 0 ; i < n ; i++){

            if(nums[i] == 0){

                while(k == 0){

                    if(nums[start] == 0){
                        k++;
                    }

                    start++;

                }

                k--;

            }

            max = Math.max(i-start+1,max);

        }

        return max ;
        
    }
}