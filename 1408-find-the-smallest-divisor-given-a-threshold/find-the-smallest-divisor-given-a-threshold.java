class Solution {

    private int sumHold(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            count += (arr[i] + k - 1) / k;
        }

        return count;

    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int ans = -1;
        int high = Arrays.stream(nums).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sumHold(nums, mid) > threshold) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;

    }
}