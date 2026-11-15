class Solution {
    public boolean helper(int[] nums, int mid, int m) {

        int lastPost = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - lastPost >= mid) {
                lastPost = nums[i];
                count++;
            }

            if (count == m) {
                return true;
            }
        }

        return count >= m;

    }

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int low = 1;
        int high = position[position.length - 1] - position[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (helper(position, mid, m)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return high;

    }
}