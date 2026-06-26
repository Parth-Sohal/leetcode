class Solution {
    public int longestSubarray(int[] nums) {

        int start = 0;
        int k = 1 ; 
        int max = 0;

        boolean zero = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                if (k > 0) {
                    zero = true;
                    k--;
                }

                else {
                    while (nums[start] != 0) {
                        start++;
                    }

                    start++;
                }

            }

            if (zero) {
                max = Math.max(max, i - start);
            } else {
                max = Math.max(max, i - start + 1);
            }

        }

        if(!zero)return max - 1; 

        return max ; 

    }
}