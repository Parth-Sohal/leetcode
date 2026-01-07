class Solution {

    private long helper(int[] piles, long h) {

        long count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += (piles[i] + h - 1) / h;
        }

        return count;

    }

    public int minEatingSpeed(int[] piles, int h) {

        long min = 1;
        long max = Arrays.stream(piles).max().getAsInt();

        while (min <= max) {

            long mid = (min + max) / 2;

            long a = helper(piles, mid);

            if (a <= h) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return (int)min ;

    }
}