class Solution {
    public int longestOnes(int[] nums, int k) {

        int start = 0;

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                if (k > 0) {
                    k--;
                }

                else {
                    while (nums[start] != 0) {
                        start++;
                    }

                    start++;
                }
            }

            max = Math.max(max, i - start + 1);

        }

        return max ; 

    }
}