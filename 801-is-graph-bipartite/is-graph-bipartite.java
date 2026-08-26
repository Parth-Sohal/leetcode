class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[graph.length]; // colour A -> 1 , colour B -> -1

        for (int i = 0; i < n; i++) {

            if (colour[i] != 0) { // visited
                continue;
            }

            Queue<Integer> queue = new LinkedList<>();
            colour[i] = 1;

            queue.add(i);

            while (!queue.isEmpty()) {

                int val = queue.poll();

                for (int neighbor : graph[val]) {
                    if (colour[neighbor] == 0) {
                        // Color neighbor with opposite color
                        colour[neighbor] = -colour[val];
                        queue.add(neighbor);
                    } else if (colour[neighbor] == colour[val]) {
                        // Conflict: adjacent nodes have the same color
                        return false;
                    }
                }

            }

        }

        return true;
    }
}