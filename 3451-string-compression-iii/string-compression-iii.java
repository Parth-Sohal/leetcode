class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int n = word.length();

        while (i < n) {
            char ch = word.charAt(i);
            int count = 0;

            // Count up to 9 consecutive identical characters
            while (i < n && word.charAt(i) == ch && count < 9) {
                count++;
                i++;
            }

            ans.append(count).append(ch);
        }

        return ans.toString();
    }
}