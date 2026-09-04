class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] minValue = new int[nums.length];
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] < min) {
                min = nums[i];
            }

            minValue[i] = min;

        }

        System.out.println(Arrays.toString(minValue));

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            int val = max - minValue[i];

            if (val <= k) {
                return i ;
            }

        }

        return -1; 
    }
}