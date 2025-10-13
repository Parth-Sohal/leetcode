class Solution {
    private int helper(int[] arr, int m) {

        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > m) {
                count++;
                sum = arr[i];
            }
        }

        if (sum > 0) {
            count++;
        }

        return count;

    }

    public int splitArray(int[] arr, int k) {

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int ans = -1;
        

        while (low <= high) {
            int mid = (low + high) / 2;
            int help = helper(arr, mid);

            if (help == k) {
                ans = mid;
                high = mid - 1;
            }

            else if (help > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return low ;

    }
}