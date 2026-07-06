class Solution {
    public int minOperations(int[] nums, int k) {
        
        PriorityQueue<Long> pq = new PriorityQueue<>() ;
        
        for(int i : nums){
            pq.add((long)i);
        }
        
        int count = 0 ; 
        
        while(pq.size() >= 2 && pq.peek() < k){
            long a =  pq.poll() ;
            long b = pq.poll() ;
            long c = Math.min(a,b) * 2 + Math.max(a,b);
            pq.offer(c);
            
            count++ ;
        }
        
        return count ;


    }
}