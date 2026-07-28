class Solution {
    public String smallestPalindrome(String s) {

        int[] charArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charArr[s.charAt(i) - 'a']++;
        }

        int start = 0;
        int end = s.length() - 1;
        //        char mid = 'a';
        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb.length());

        for (int i = 0; i < charArr.length && start < end; i++) {

            char ch = (char) (i + 'a');

            while (charArr[i] > 0 && start < end &&
                    charArr[i] != 1) {

                sb.setCharAt(start, ch);
                sb.setCharAt(end, ch);

                start++;
                end--;
                charArr[i] -= 2;

            }

        }

        if (start == end) {

            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == 1) {
                    sb.setCharAt(start, (char) (i + 'a'));
                    break;
                }
            }

        }

        return sb.toString();
    }
}