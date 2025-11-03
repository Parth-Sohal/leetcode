class Solution {
    public int myAtoi(String s) {

        int i = 0;
        long ans = 0;
        int count = 0;
        int sign = 1;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ans = ans * 10 + s.charAt(i) - '0';
            if (sign * ans >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * ans <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign * ans);
    }
}