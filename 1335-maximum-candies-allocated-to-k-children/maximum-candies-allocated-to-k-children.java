class Solution {

    private long ans(int[] candies, long k) {

        long count = 0;
        for (int i = 0; i < candies.length; i++) {
            count += candies[i] / k;
        }

        return count;

    }

    public int maximumCandies(int[] candies, long k) {
        int low = 1;
        int high = Arrays.stream(candies).max().getAsInt();

        while (low <= high) {

            int mid = (low + high) / 2;
            long res = ans(candies, mid);

            if (res < k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return high;

    }
}