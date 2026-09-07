class Solution {
    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n + 1; i++)
            adj.add(new ArrayList<>());

        for (int[] time : times) {
            adj.get(time[0]).add(new Pair(time[1], time[2]));
        }

        PriorityQueue<Pair> q = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.distance, b.distance));

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        q.offer(new Pair(k, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();

            if (p.distance > dist[p.node]) {
                continue;
            }

            for (Pair neighbour : adj.get(p.node)) {

                int currDist = p.distance + neighbour.distance;

                if (currDist < dist[neighbour.node]) {
                    dist[neighbour.node] = currDist;
                    q.offer(new Pair(neighbour.node, currDist));
                }

            }

        }

        int max = dist[1];

        for (int i = 1; i < dist.length; i++) {
            if (dist[i] > max)
                max = dist[i];

        }

        if(max == Integer.MAX_VALUE)return -1 ; 
        return max ; 
    }
}