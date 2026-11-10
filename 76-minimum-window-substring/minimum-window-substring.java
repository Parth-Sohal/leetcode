class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;

        // small - t , big - s

        int n = s.length(); // big
        int m = t.length();// small

        if (m > n) {
            return "";
        }

        int st = -1;
        int end = -1;

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int required = map1.size();
        int formed = 0;
        int start = 0;

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (map1.containsKey(ch)) {
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);

                if (map1.get(ch).equals(map2.get(ch))) {
                    formed++;
                }

            }

            while (formed == required) {

                int len = i - start + 1;

                if (len < min) {
                    st = start;
                    end = i;
                    min = len;
                }

                char c = s.charAt(start);

                if (map1.containsKey(s.charAt(start))) {

                    
                    map2.put(c, map2.get(c) - 1);

                    if(map1.get(c) > map2.get(c)){
                        formed--; 
                    }

                    if (map2.get(c) == 0) {
                        map2.remove(c);
                    }

                }

                start++;

            }

        }

        if (st == -1) {
            return "";
        }

        return s.substring(st, end + 1);

    }
}