class Solution {
    public boolean dfs(int[][] graph, int[] colour, int node, int color) {

        colour[node] = color;
        int newColour = (color == 0) ? 1 : 0;

        for (Integer neighbour : graph[node]) {

            if (colour[neighbour] != -1) {

                if (colour[neighbour] == color) {
                    return true;
                }

            } else {
                if (dfs(graph, colour, neighbour, newColour)) {
                    return true;
                }
            }


        }

        return false;

    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length ; 
        int[] colours = new int[n];
        Arrays.fill(colours, -1);

        for (int i = 0; i < n; i++) {
            if (colours[i] == -1) {
                if(dfs(graph, colours, i, 0) ){
                    return false ; 
                }
            }
        }

        return true  ; 
    }
}