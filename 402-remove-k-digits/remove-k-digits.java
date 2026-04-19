class Solution {
    public String removeKdigits(String s, int k) {
        Deque<Integer> d = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            int n = s.charAt(i) - '0';

            while (!d.isEmpty() && k > 0 && n < d.peekLast()) {
                d.pollLast();
                k--;
            }

            d.addLast(n);

        }

        int ans = 0;

        // System.out.println(d);

        while (!d.isEmpty() && k > 0) {
            d.pollLast();
            k--;
        }

        // build result
        StringBuilder sb = new StringBuilder();
        while (!d.isEmpty()) {
            sb.append(d.pollFirst());
        }

        // remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();

    }
}