class Solution {

    public int sqrt(int n) {

        long low = 1 ; 
        long high = n  ; 
        long ans = n ; 

        long prod = 1 ; 

        while(low <= high){

            long mid = (low) + (high - low)/2 ;

            prod = mid * mid ;

            if(prod == n)return (int)mid ; 

            if(prod > n){
                high = mid - 1 ;
            }

            else{
                ans = mid  ;
                low = mid  + 1;
            }

        }


        return (int) ans   ;

    }


    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : gifts) {
            pq.add(i);
        }

        while (k > 0) {
            pq.add( sqrt(pq.poll()));
            k--;
        }

        long sum = 0;

        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}