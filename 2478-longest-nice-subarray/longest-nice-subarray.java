class Solution {
    public int longestNiceSubarray(int[] nums) {

        int n = nums.length, max = 1;

        for (int i = 0; i < n; i++) {

            int mask = nums[i];
            for (int j = i + 1; j < n; j++) {

                if((mask & nums[j]) != 0)break ; 

                mask |= nums[j];
                max = Math.max(j-i+1 , max);

            }

        }


        return max ; 

    }
}
