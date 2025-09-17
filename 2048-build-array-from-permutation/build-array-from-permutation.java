class Solution {
    public int[] buildArray(int[] nums) {

        // int lenght = nums.lenght ;

        int[] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length ; ++i){
            ans[i] = nums[nums[i]];
        }

        return ans;
        
    }
}