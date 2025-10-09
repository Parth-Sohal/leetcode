class Solution {

    private int requiredDays(int[] arr, int k) {

        int sum = 0;
        int count = 0;
        int i = 0;

        while (i < arr.length) {
            sum += arr[i];
            if (sum == k) {
                count++;
                sum = 0;
            } else if (sum > k) {
                count++;
                sum = arr[i];
            }
            i++;
        }

        if (sum > 0) {
            count++;
        }

        // System.out.println("Min day with this " + k + " capacity is  : " + count);
        return count;
    }


    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int val = requiredDays(weights, mid);

            if (val > days) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }


        }
        return ans;
    }
}