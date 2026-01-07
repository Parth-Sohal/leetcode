class Solution {

    public static boolean helper(int[] bloomDay, int k , int m , int n){

        int count = 0 ;
        int total = 0 ;

        for(int i = 0 ; i < bloomDay.length ; i++){
            if(bloomDay[i] <= k){
                count++;
            }
            else{
                total += count / n ;
                count = 0;
            }
        }

        total += count / n ;
        // System.out.print(total + " " );

        return total >= m ;

    }

    public int minDays(int[] bloomDay, int m, int n) {
        if((long)m * n > bloomDay.length)return -1;

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        while(low <= high){
            int mid = low + (high - low)/2;

            if(helper(bloomDay, mid , m , n) ){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return low ;

    }
}