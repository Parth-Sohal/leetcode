class Solution {
    private boolean make(int[] arr , int day , int bouqutes, int k){

        int i = 0 ;
        int total = 0 ;

        while(i < arr.length){
            int count = 0;

            if(arr[i] <= day){
                count++;
                i++;
                while( i < arr.length && arr[i] <= day ){
                    count++;
                    i++;
                }
            }else{
                i++;
            }
            total += (count / k);

        }
  
        if(total >= bouqutes){
            return true;
        }

        return false;

    }



    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if (m * k > n) {
            return -1;
        }

        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();

        int low = min;
        int high = max;

        int ans = -1;

        while (low <= high) {

            int day = (low + high) / 2;

            if (make(bloomDay, day, m, k)) {
                ans = day;
                high = day - 1;
            } else {
                low = day + 1;
            }

        }

        return ans;

    }
}