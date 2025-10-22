class Solution {
    private int helper(int[] arr, int val) {
        int count = 1;
        int lastIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[lastIdx] >= val) {
                count++;
                lastIdx = i;
            }
        }

        return count;

    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int low = 1;
        int high = position[position.length - 1] - position[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = helper(position, mid);
            // System.out.println("cuurent i : " + mid + "   current count : " + res);

            if (res < m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high ;

    }
}