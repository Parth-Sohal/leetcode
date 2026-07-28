class Solution {
    public String smallestPalindrome(String s) {

        int[] charArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charArr[s.charAt(i) - 'a']++;
        }

        int start = 0;
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < charArr.length && start < end; i++) {

            char ch = (char) (i + 'a');

            while (charArr[i] > 1 && start < end) {

                sb.setCharAt(start++, ch);
                sb.setCharAt(end--, ch);
                charArr[i] -= 2;

            }

        }

      

        return sb.toString();
    }
}