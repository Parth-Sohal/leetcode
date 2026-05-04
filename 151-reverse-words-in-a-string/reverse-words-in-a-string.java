class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            if (s.charAt(i) == ' ') {
                i--;
            }

            else {

                int end = i;

                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }

                int start = i;

                sb.append(s.substring(start + 1, end + 1) + " ");

            }

        }

        return (sb.toString().trim());

    }
}