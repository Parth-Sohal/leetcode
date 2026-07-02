class Solution {
    public int characterReplacement(String s, int k) {

        int max = 0;

        int start = 0;
        int[] count = new int[26];
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            count[c - 'A']++;

            maxFreq = Math.max(maxFreq, count[c - 'A']);

            int l = i - start + 1;

            while (l - maxFreq > k) {

                int ch = s.charAt(start);

                count[ch - 'A']--;

                maxFreq = 0;
                for (int n : count) {
                    maxFreq = Math.max(maxFreq, n);
                }

                start++;
                l = i - start + 1;

            }

            max = Math.max(l, max);

        }


        return max ; 

    }
}