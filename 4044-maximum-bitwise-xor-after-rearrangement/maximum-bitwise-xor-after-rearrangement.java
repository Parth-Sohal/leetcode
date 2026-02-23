class Solution {
    public String maximumXor(String s, String t) {

        int countOne = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '1') {
                countOne++;
            }
        }

        // System.out.println(countOne);

        StringBuilder sb = new StringBuilder(s);
        int j = 0;

        while (countOne > 0 && j < s.length()) {
            if (sb.charAt(j) == '0') {
                sb.setCharAt(j, '5');
                countOne--;
            }
            j++;
        }

        j = sb.length() - 1;

        while (countOne > 0 && j >= 0) {

            if (sb.charAt(j) != '5') {

                sb.setCharAt(j, '0');
                countOne--;
            }

            j--;
        }

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '5') {
                sb.setCharAt(i, '1');
            }
        }

        return sb.toString();

    }
}