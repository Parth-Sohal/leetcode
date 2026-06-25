class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int majority = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == target) {
                    majority++;
                }

                if (majority * 2 > (j - i + 1)) {
                    ans++;
                }

            }

        }

        return ans  ;

    }
}