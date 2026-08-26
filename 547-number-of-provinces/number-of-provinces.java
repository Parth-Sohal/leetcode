class Solution {
    public void dfsI(int[][] isConnected, int node, boolean[] visited) {

        visited[node] = true;

        for (int i = 0; i < isConnected[node].length; i++) {
            if (isConnected[node][i] == 1 && !visited[i]) {
                dfsI(isConnected, i, visited);
            }
        }

    }

    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] visited = new boolean[isConnected.length];

        for (int i = 0; i < isConnected.length; i++) {

            if (!visited[i]) {
                dfsI(isConnected, i, visited);
                count++;
            }

        }

        return count ; 
    }
}