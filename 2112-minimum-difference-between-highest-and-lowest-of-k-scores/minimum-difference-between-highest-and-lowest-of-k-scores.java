class Solution {
    public int minimumDifference(int[] nums, int k) {

        if(nums.length == 1) return 0 ;

        Arrays.sort(nums);
        int i = 0 ;
        int max = Integer.MAX_VALUE ;

        while(i+k-1 < nums.length){

            max = Math.min(max , nums[i+k-1] - nums[i]);
            i++;
        }

        return max ; 
        
    }
}