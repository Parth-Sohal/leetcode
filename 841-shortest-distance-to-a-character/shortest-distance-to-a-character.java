class Solution {
    public int[] shortestToChar(String s, char c) {
       
        int left = -1;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                right = i;
                break;
            }
        }

        int[] ans = new int[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == c) {
                ans[k++] = 0;
                left = i;
                right++;
                while (right < s.length() && s.charAt(right) != c) {
                    right++;
                }

            }

            else if (left == -1) {
                ans[k++] = right - i;
            }

            else if (right == s.length()) {
                ans[k++] = i - left;
            }

            else {

                ans[k++] = Math.min(i - left, right - i);

            }

        }

        return ans ; 
    }
}