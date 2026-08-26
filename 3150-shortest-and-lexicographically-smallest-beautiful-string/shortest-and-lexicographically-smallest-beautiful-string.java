class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int min = Integer.MAX_VALUE;
        String ans = "";

        int start = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '1') {
                count++;
            }

            while (count >= k) {

                int subLen = i - start + 1;
                String candidate = s.substring(start, i + 1);

                if (subLen < min) {
                    min = subLen;
                    ans = candidate;
                } else if (subLen == min) {

                    if (candidate.compareTo(ans) < 0) {
                        ans = candidate;
                    }

                }

                if (s.charAt(start) == '1') {
                    count--;
                }

                start++;
            }

        }

        return ans ; 
    }
}