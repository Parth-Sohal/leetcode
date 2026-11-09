class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = fruits.length;
        int start = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            map.put(fruits[i], i);

            if (map.size() > 2) {

                int leastIdx = Integer.MAX_VALUE;

                for (int key : map.keySet()) {
                    leastIdx = Math.min(leastIdx, map.get(key));
                }

                map.remove(fruits[leastIdx]);
                start = leastIdx + 1;

            }

            max = Math.max(i - start + 1, max);

        }

        return max;
    }
}