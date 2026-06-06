class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] prefArr = new int[nums.length];
        int sum = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            prefArr[i] = sum ; 
            sum += nums[i];
        }

        sum = 0 ;

        for(int i = prefArr.length - 1; i>=0 ; i--){
            prefArr[i] = Math.abs(prefArr[i] - sum);
            sum+= nums[i];
        }

        return prefArr ; 

        
    }
}