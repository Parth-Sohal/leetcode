class Solution {

    public  boolean dfs(int[][] graph, int node, boolean[] visited, boolean[] path) {

        visited[node] = true;
        path[node] = true;

        for (Integer neighbour : graph[node]) {

            if (!visited[neighbour] && dfs(graph, neighbour, visited, path)) {
                return true;
            }

            else if (path[neighbour]) {
                return true;
            }

        }

        path[node] = false;
        return false;

    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        boolean[] isSafe = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {

            if (!visited[i]) {
                dfs(graph, i, visited, isSafe);
            }

        }

        System.out.println(Arrays.toString(isSafe));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            if (!isSafe[i]) {
                list.add(i);
            }
        }


        return list ; 
    }
}