class Solution {

    public static int atMostk(int[] arr, int k) {

        int oddCount = 0;
        int start = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (arr[start] % 2 != 0) {
                    oddCount--;
                }
                start++;
            }

            total += (i - start + 1);

        }

        return total;

    }

    public int numberOfSubarrays(int[] nums, int k) {
        return atMostk(nums , k) - atMostk(nums,k-1) ;
    }
}