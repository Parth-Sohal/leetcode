class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0)
            return;

        int put = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums2[j] >= nums1[i]) {
                nums1[put] = nums2[j];
                put--;
                j--;
            } else {
                nums1[put] = nums1[i];
                put--;
                i--;
            }
        }

        while (j >= 0) {
            nums1[put] = nums2[j];
            j--;
            put--;
        }

    }
}