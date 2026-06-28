class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int max = 0;

        for (int i = 0; i < fruits.length; i++) {

            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);

            while (map.size() > 2) {
                int n = fruits[start];

                map.put(n, map.get(n) - 1);

                if (map.get(n) == 0) {
                    map.remove(n);
                }
                start++;
            }

            if (map.size() == 2) {
                max = Math.max(max, i - start + 1);
            }

        }

        if(map.size() < 2)return fruits.length ; 

        return max;
    }
}