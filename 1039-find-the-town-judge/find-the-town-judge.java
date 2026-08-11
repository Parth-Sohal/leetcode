class Solution {
    public int findJudge(int n, int[][] trust) {

        HashMap<Integer, int[]> graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new int[2]);
        }

        for (int i = 0; i < trust.length; i++) {

            int a = trust[i][0];
            int b = trust[i][1];

            graph.get(a)[1]++;
            graph.get(b)[0]++;

        }

        for (Integer key : graph.keySet()) {
            int a = graph.get(key)[0];
            int b = graph.get(key)[1];

            if (a == n - 1 && b == 0) {
                return key ; 
            }

        }


        return -1 ; 
    }
}