class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        long max = Arrays.stream(piles).max().getAsInt();

        long low = 1;
        long high = max;
        long ans = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long count = 0;

            for (int i = 0; i < piles.length; i++) {
                count += (piles[i] + mid - 1) / mid;
            }

            // System.out.println(count + " " + mid);

            if (count > h) {
                low = mid + 1; // banass badane hai
            }

            else {
                ans = mid;
                // System.out.println(ans);
                high = mid - 1;
            }

        }

        return (int)ans;
    }
}