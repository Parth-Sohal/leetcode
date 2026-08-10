class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }


        HashSet<Integer> visited = new HashSet<>();
        visited.add(source);
        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        while (!q.isEmpty()) {

            int node = q.poll();

            if (node == destination) {
                return true;
            }

            for (Integer neighbour : graph.get(node)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    q.add(neighbour);
                }
            }

        }

        return false;

    }
}