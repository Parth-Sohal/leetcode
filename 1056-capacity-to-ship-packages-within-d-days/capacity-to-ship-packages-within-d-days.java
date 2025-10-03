class Solution {

    private int Days(int[] arr, int max) {
        int count = 0;
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum += arr[i];

            if (sum == max) {
                count++;
                sum = 0;
            } else if (sum > max) {
                count++;
                sum = arr[i];
            }
            i++;

        }
        // System.out.println("Count : " + count + ' ' + sum );
        if (sum > 0) {
            count++;
        }
        // System.out.println("Count : " + count);
        return count;

    }

    public int shipWithinDays(int[] weights, int k) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = -1;

        while (low <= high) {

            int days = (low + high) / 2;

            System.out.println("Try Days : " + days);
            int count = Days(weights, days);

            if (count > k) {
                low = days + 1;
            } else {
                ans = days;
                high = days - 1;
            }

        }

        return ans;
    }
}