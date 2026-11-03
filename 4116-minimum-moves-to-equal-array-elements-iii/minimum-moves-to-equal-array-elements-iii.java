class Solution {
    public int minMoves(int[] nums) {

        int max = Integer.MIN_VALUE;

        int sum = 0;

        for (int j : nums) {
            sum += j;
            max = Math.max(max, j);
        }

        return max * nums.length - sum ;

    }
}