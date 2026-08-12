class Solution {
    public int maxSum(int[] nums , int k){

        Arrays.sort(nums) ;


        for(int i = 0 ; i <  nums.length && k > 0 ; i++){
            if(nums[i] < 0){
                k--;
                nums[i] = -nums[i];
            }
        }

        Arrays.sort(nums) ;


        if(k % 2 != 0){
            nums[0] = -nums[0];
        }

        return Arrays.stream(nums).sum() ;


    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        return maxSum(nums , k) ;
    }
}