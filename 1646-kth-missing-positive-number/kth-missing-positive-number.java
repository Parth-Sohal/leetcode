class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 0;
        int i = 1;
        int k2  = k ;
        for (i = 1; i <= arr[arr.length - 1] + k2  ; i++) {
            if ( j < arr.length && arr[j] == i ) {
                j++;
            } else {
                k--;
            }

            if( k == 0)break;

        
        }

        return i;
    }
}