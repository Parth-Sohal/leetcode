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

            if ((i - start + 1) - maxFreq > k) {
                count[s.charAt(start) - 'A']--;
                start++; 
            }

        
            max = Math.max(max, i - start + 1);

        }


        return max ; 

    }
}