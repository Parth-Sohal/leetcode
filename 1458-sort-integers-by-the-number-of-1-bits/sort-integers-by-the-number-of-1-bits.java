class Solution {

    private void merge(int[] arr, int low, int mid, int high) {

        int[] ans = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            int a = Integer.bitCount(arr[i]);
            int b = Integer.bitCount(arr[j]);

            if (a < b) {
                ans[k++] = arr[i++];
            }

            else if (a == b) {

                if (arr[i] <= arr[j]) {
                    ans[k++] = arr[i++];
                } else {
                    ans[k++] = arr[j++];
                }

            }

            else {
                ans[k++] = arr[j++];
            }

        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }

        while (j <= high) {
            ans[k++] = arr[j++];
        }

        for (int it = 0; it < ans.length; it++) {
            arr[it + low] = ans[it];
        }

        //        System.out.println(Arrays.toString(ans));

    }

    public void mergeBit(int[] arr, int low, int high) {

        if (low >= high)
            return;

        int mid = low + ((high - low) / 2);

        mergeBit(arr, low, mid);

        mergeBit(arr, mid + 1, high);

        merge(arr, low, mid, high);

    }

    public int[] sortByBits(int[] arr) {
        mergeBit(arr,0,arr.length-1);
        return arr ; 
    }
}
