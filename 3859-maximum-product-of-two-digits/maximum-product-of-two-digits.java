class Solution {
    public int maxProduct(int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    

        while(n > 0){

            int mod = n % 10  ; 

            pq.add(mod) ;

            if(pq.size() > 2){
                pq.poll() ;
            }

            n = n / 10 ; 
        
        }


        return pq.poll() * pq.poll() ;
        
    }
}