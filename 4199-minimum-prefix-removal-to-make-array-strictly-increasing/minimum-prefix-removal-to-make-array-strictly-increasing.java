class Solution {
    public int minimumPrefixLength(int[] nums) {

        int l = -1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] <= nums[i - 1]) {
                // System.out.println(nums[i - 1] + " " + nums[i]);
                l = i - 1;
            }

        }

        if(l == -1)return 0 ;

        return l+1; 

    }
}