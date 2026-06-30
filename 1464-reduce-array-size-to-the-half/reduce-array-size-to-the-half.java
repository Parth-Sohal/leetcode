class Solution {
    public int minSetSize(int[] arr) {
        int target = arr.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            pq.offer(map.get(key));
        }

        int total = 0;
        int count = 0;

        while (!pq.isEmpty()) {
            total += pq.poll();
            count++;
            if (total >= target) {
                break;
            }
        }

        return count ; 

    }
}