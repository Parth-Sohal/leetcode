class Solution {
    public int longestOnes(int[] nums, int k) {

        int max = 0 ; 
        int zeros = 0 ;
        int start = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == 0){
                zeros++ ;
            }

            if(zeros > k){
                if(nums[start] == 0)zeros--;
                start++;
            }

            if(zeros <= k){
                max = Math.max(max, i-start+1);
            }


        }

    
        return max ; 

    }
}