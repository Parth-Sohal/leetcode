class Solution {

    static private class Pair {
        int data;
        int count;

        Pair(int data, int count) {
            this.data = data;
            this.count = count;
        }

    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
                (a, b) -> Integer.compare(a.count, b.count)
        );

        // int k = 2;

        for (Integer key : map.keySet()) {

            pq.offer(new Pair(key, map.get(key)));

            if (pq.size() > k) {
                pq.poll();
            }

        }

        int[] ans = new int[k];
        int it = 0 ; 

        while(!pq.isEmpty()){
            ans[it++] = pq.poll().data ; 
        }

        return ans ; 

    }
}