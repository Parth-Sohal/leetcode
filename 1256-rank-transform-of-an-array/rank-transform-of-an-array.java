class Solution {
    public int[] arrayRankTransform(int[] arr) {

        if(arr.length == 0 || arr == null) return arr ; 

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            pq.add(i);
        }


        int rank = 1;
        int last = pq.peek();

        int k = 0;

        while (!pq.isEmpty()) {
            int ele = pq.poll();

            if (ele != last) {
                rank++;
            }

            map.put(ele, rank);
            last = ele;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr ; 

    }
}