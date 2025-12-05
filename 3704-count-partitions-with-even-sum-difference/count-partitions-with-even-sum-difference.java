class Solution {
    public int countPartitions(int[] nums) {
        int sum = Arrays.stream(nums).sum();

        int count = 0;
        int runningSum = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            runningSum += nums[i];

            int sub = sum - runningSum;

            if ((sub - runningSum) % 2 == 0) {
                count++;
            }

        }

        return count ; 
    }
}