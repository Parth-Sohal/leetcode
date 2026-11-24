class Solution {
    public String convert(String s, int n) {

        if (n <= 1 || n >= s.length()) {
            return s;
        }

        StringBuilder[] sbs = new StringBuilder[n];

        for (int i = 0; i < n; i++) {
            sbs[i] = new StringBuilder();
        }

        int dir = -1;
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {

            sbs[idx].append(s.charAt(i));
            if (idx == 0) {
                dir = 1;
            }

            else if (idx == n - 1) {
                dir = -1;
            }

            idx += dir;

        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : sbs) {
            result.append(row);
        }

        return result.toString();

    }
}