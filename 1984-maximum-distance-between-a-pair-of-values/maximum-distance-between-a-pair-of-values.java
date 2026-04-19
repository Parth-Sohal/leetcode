class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;

        for (int i = 0; i < nums1.length; i++) {

            int low = i;
            int high = nums2.length - 1;
            int ans = -1;

            while (low <= high) {

                int mid = (low + high) / 2;

                if (nums1[i] > nums2[mid]) {
                    high = mid - 1;
                } else {
                    ans = mid;
                    low = mid + 1;
                }

            }

            // System.out.println(nums1[i] + " " + i + " " + ans);

            if (!(ans == -1)) {
                max = Math.max(max, Math.abs(i - ans));
            }

        }

        return max ; 
    }
}