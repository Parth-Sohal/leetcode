class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        // Allocate a single temporary array to prevent repeated allocations in recursion
        int[] temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temp);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Recursively divide the left and right halves
        mergeSort(nums, left, mid, temp);
        mergeSort(nums, mid + 1, right, temp);

        // Merge the two sorted halves back together
        merge(nums, left, mid, right, temp);
    }

    private void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;      // Pointer for the left subarray
        int j = mid + 1;  // Pointer for the right subarray
        int k = left;     // Pointer for the temp array

        // Combine elements in sorted order
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements from the left subarray, if any
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements from the right subarray, if any
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // Copy back sorted slice into the original array
        for (int index = left; index <= right; index++) {
            nums[index] = temp[index];
        }
    }
}