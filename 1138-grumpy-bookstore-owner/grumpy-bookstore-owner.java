class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int sum = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        int max = sum;
        int start = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                sum += customers[i];
            }
            max = Math.max(max, sum);
        }

        for (int i = minutes; i < customers.length; i++) {

            if (grumpy[start] == 1) {
                sum -= customers[start];
            }

            if (grumpy[i] == 1) {
                sum += customers[i];
            }

            max = Math.max(max, sum);
            start++;

        }

        return max;
    }
}