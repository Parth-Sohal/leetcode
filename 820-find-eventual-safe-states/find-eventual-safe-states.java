class Solution {
    public boolean dfs(
            int[][] graph,
            boolean[] visited,
            boolean[] path,
            boolean[] isSafe,
            int node) {

        visited[node] = true;
        path[node] = true;

        for (Integer neighbour : graph[node]) {

            if (!visited[neighbour]) {

                if (dfs(graph, visited, path, isSafe, neighbour)) {
                    isSafe[node] = false;
                    path[node] = false;
                    return true;
                }

            }

            else if (path[neighbour] || !isSafe[neighbour]) {

                isSafe[node] = false;
                path[node] = false;
                return true;
            }
        }

        isSafe[node] = true;

        path[node] = false;

        return false;

    }

    public List<Integer> eventualSafeNodes(int[][] graph) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = graph.length;

        boolean[] visited = new boolean[n];
        boolean[] path = new boolean[n];
        boolean[] isSafe = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, visited, path, isSafe, i);
            }
        }

        for (int i = 0; i < isSafe.length; i++) {
            if (isSafe[i]) {
                ans.add(i);
            }
        }

        return ans;

    }
}