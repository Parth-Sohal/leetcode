class Solution {
    public String sortSentence(String s) {

        String[] ans = new String[10];

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == ' ') {
                while (i < s.length() && s.charAt(i) == ' ') {
                    i++;
                }
            }

            else {
                int start = i;
                while (i < s.length() && s.charAt(i) != ' ') {
                    i++;
                }
                int end = i - 1;
                int idx = s.charAt(end) - '0';
                // System.out.println(idx);

                ans[idx] = s.substring(start, i - 1);
            }

        }
        //        System.out.println(ans);

        StringBuffer sb = new StringBuffer();
        for (String k : ans) {
            if (k != null) {
                sb.append(k + " ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}