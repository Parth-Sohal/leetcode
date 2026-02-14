class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {

            char ch = order.charAt(i);

            if (map.containsKey(ch)) {

                for (int j = 0; j < map.get(ch); j++) {
                    sb.append(ch);
                }

                map.remove(ch);

            }

        }

        for (Character key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                sb.append(key);
            }
        }

        System.out.println(sb.toString());
        return sb.toString();
    }
} 