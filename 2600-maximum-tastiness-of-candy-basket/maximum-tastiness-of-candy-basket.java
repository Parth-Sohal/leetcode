class Solution {

    public boolean canGive(int[] arr, int k, int price) {

        int last = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - last >= price) {
                count++;
                last = arr[i];
            }

            if (count >= k) {
                return true;
            }

        }

        return count >= k;

    }

    public int maximumTastiness(int[] arr, int k) {

        Arrays.sort(arr);

        int low = 1;
        int high = arr[arr.length - 1] - arr[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            boolean ans = canGive(arr, k, mid);

            // System.out.println(mid + " " + ans);

            if (ans) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return high ; 

    }
}