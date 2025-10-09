class Solution {
    private boolean value(int n , int[] arr ,  int k){

        int i = 0 ;
        int count = 0;

        while(count <= n && i < arr.length){

            count += (arr[i] / k) ;


            if(arr[i] % k != 0){
                count++;
            }

            if(count > n){
                return false;
            }

            i++;
        }
        return true ;

    }


    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = Arrays.stream(quantities).max().getAsInt();
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (value(n, quantities, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans ;
    }
}