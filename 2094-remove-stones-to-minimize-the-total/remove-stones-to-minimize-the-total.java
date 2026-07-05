class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : piles) {
            pq.add(i);
        }

        while (k > 0) {
            int maxStones = pq.poll(); 
            pq.add(maxStones - (maxStones / 2));
            k--;
        }

        int sum = 0;
        for (int stone : pq) {
            sum += stone;
        }
        return sum;

    }
}