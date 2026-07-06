class Solution {
    public int halveArray(int[] nums) {

        double sum = 0;

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : nums) {
            pq.add((double) i); 
            sum += i;
        }

        double target = sum / 2.0;
        int count = 0;

        while (sum > target) {
            double a = pq.poll();
            a = a / 2.0;
            pq.add(a);
            sum -= a;
            count++;
            // pq.offer(a);
        }

        // System.out.println(count);

        return count ; 

    }
}