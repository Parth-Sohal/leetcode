class Solution {
    public boolean helper(int[] dist, double hour, int mid) {

        double time = 0;

        for (int i = 0; i < dist.length; i++) {

            if (i == dist.length - 1) {
                time += (double) dist[i] / mid;
            }

            else {
                time += Math.ceil((double) dist[i] / mid);
            }

        }

        return time <= hour;

    }

    public int minSpeedOnTime(int[] dist, double hour) {

        if (hour <= dist.length - 1) {
            return -1;
        }

        int low = 1;
        int high = high = 10_000_000;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (helper(dist, hour, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return low;

    }
}