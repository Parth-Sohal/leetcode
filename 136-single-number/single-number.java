class Solution {
    public int singleNumber(int[] nums) {

        // / property of xor if a ^ a = 0 

        int ans = 0;

        for (int i : nums) {
            ans = ans ^ i;
        }

        return ans;

    }
}