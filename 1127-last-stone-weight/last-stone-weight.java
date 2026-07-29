class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }

        // System.out.println(pq);

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();

            if (a != b) {
                pq.offer(a - b);
            }

        }


        if(pq.isEmpty())return 0;
        return pq.poll() ;
    }
}