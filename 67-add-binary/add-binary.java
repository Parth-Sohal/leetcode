class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int countOne = 0;

            if (carry != 0) {
                countOne++;
            }

            if (i >= 0 && a.charAt(i) == '1') {
                countOne++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                countOne++;
            }

            if (countOne % 2 != 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }

            if (countOne >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }

            i--;
            j--;
        }

        sb.reverse();

        return sb.toString();
    }
}