class Solution {
    public String freqAlphabets(String s) {

        StringBuilder sb1 = new StringBuilder(s.length());
        int i = 0;
        while (i < s.length()) {

            System.out.println("Current i  : " + i);

            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {

                int a = (s.charAt(i) - '0');
                int b = (s.charAt(i + 1) - '0');
                int num = a * 10 + b - 1;
                char val = (char) ('a' + num);
                sb1.append(val);
                i = i + 3;
            }

            else {
                int num = s.charAt(i) - '0' - 1;
                char val = (char) ('a' + num);
                sb1.append(val);
                i++;
            }

        }

        return sb1.toString();
    }
}