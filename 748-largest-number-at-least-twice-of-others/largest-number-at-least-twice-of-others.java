class Solution {
    public int dominantIndex(int[] nums) {

        int max = Arrays.stream(nums).max().getAsInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max) {
                if (nums[i] * 2 > max) {
                    return -1;
                }
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == max){
                return i ;
            }
        }

        return -1;
    }
}