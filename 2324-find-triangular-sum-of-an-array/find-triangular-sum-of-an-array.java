class Solution {
    public int triangularSum(int[] nums) {

        int l = nums.length - 1;

        while (l >= 1) {
            for (int i = 0; i < l; i++) {
                nums[i] = ((nums[i] + nums[i + 1]) % 10);
            }
            l--;
            // System.out.println(Arrays.toString(nums));
        }

        return nums[0];

    }
}