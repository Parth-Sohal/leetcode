class Solution {
    public int findKthPositive(int[] arr, int k) {

        int i = 1;

        int j = 0;

        while (j < arr.length && k > 0) {
            if (arr[j] == i) {
                j++;
            } else {
                k--;
            }
            if (k > 0) {
                i++;
            }
        }

        if (k > 0) {
            i = arr[arr.length -1 ] + k;
        }


        return i ;
    }
}