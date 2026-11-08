class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {

            StringBuilder sbRow = new StringBuilder();

            for (int j = 0; j < grid[0].length; j++) {
                sbRow.append(grid[i][j]).append(" ");
            }

            map.put(sbRow.toString(), map.getOrDefault(sbRow.toString(), 0) + 1);

        }

        int ans = 0;

        for (int i = 0; i < grid.length; i++) {

            StringBuilder sbCol = new StringBuilder();

            for (int j = 0; j < grid[0].length; j++) {

                sbCol.append(grid[j][i]).append(" ");

            }

            if (map.containsKey(sbCol.toString())) {
                ans += map.get(sbCol.toString());
            }

        }

        return ans;
    }
}