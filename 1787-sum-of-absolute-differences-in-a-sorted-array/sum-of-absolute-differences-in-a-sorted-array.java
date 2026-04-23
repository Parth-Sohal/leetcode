class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int[] leftPRf = new int[nums.length];
        int[] rightPRf = new int[nums.length];

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < nums.length; i++) {
            leftPRf[i] = sumLeft;
            sumLeft += nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            rightPRf[i] = sumRight;
            sumRight += nums[i];
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int leftNumber = i;
            int rightNumber = nums.length - i - 1;

            ans[i] = Math.abs(leftPRf[i] - ((nums[i]) * leftNumber)) + Math.abs(rightPRf[i] - ((nums[i]) * rightNumber));

        }


        return ans ; 

    }
}