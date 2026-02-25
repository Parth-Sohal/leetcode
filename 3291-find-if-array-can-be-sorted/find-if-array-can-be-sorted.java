class Solution {
    public boolean canSortArray(int[] nums) {

        int i = 0;
        int lastMax = Integer.MIN_VALUE;

        while (i < nums.length) {

            int currBit = Integer.bitCount(nums[i]);
            int currMin = nums[i];
            int currMax = nums[i];

            while (i < nums.length && (currBit == Integer.bitCount(nums[i]))) {
                currMin = Math.min(currMin, nums[i]);
                currMax = Math.max(currMax, nums[i]);
                i++;
            }

            if (currMin < lastMax) {
                return false;
            }

            lastMax = currMax;
        }

        return true ; 




    }
}