class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m)
            return false;

        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();

        for (int j = 0; j < m; j++) {
            char c = s2.charAt(j);

            if (map1.containsKey(c)) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }

            if (j >= n ) {

                char ch = s2.charAt(j - n);

                if (map2.containsKey(ch)) {
                    map2.put(ch, map2.get(ch) - 1);

                    if (map2.get(ch) == 0) {
                        map2.remove(ch);
                    }
                }

            }

            if (j >= n-1 && map1.size() == map2.size()) {
                boolean flag = true;

                for (Character key : map1.keySet()) {
                    if (!map1.get(key).equals(map2.getOrDefault(key, 0))) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    return true;
                }

            }

        }

        return false ; 

    }
}