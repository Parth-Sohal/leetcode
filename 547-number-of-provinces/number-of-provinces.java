class Solution {
    public  void garphConnectedComponents(int[][] mat, boolean[] visited, int idx) {

        Queue<Integer> q = new LinkedList<>();
        q.add(idx);

        while (!q.isEmpty()) {

            int i = q.poll();

            for (int col = 0; col < mat[i].length; col++) {
                if (mat[i][col] == 1 && !visited[col]) {
                    visited[col] = true;
                    q.add(col);
                }
            }

        }

    }

    public int isConnected(int[][] mat) {

        boolean[] visited = new boolean[mat.length];

        int count = 0;

        for (int row = 0; row < mat.length; row++) {

            if (visited[row]) {
                continue;
            }
            visited[row] = true;

            for (int col = 0; col < mat[row].length; col++) {

                if (mat[row][col] == 1 && !visited[col]) {
                    garphConnectedComponents(mat, visited, col);
                }

            }

            count++;

        }

       return count ;

    }

    public int findCircleNum(int[][] isConnected) {
        return isConnected(isConnected) ;
    }
}