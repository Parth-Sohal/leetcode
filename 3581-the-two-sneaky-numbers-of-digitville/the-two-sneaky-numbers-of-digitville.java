class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int k = 0;

        int i = 0;
        while (i < nums.length) {
            int idx = nums[i];
            if (nums[idx] == nums[i]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
            // System.out.println(Arrays.toString(nums));
        }

        ans[0] = nums[nums.length - 2];
        ans[1] = nums[nums.length - 1];

        return ans ; 

    }
}