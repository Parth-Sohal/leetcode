class Solution {
    public int characterReplacement(String s, int k) {

        int[] arr = new int[26];

        int start = 0;
        int maxFreq = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            arr[ch - 'A']++;

            maxFreq = Math.max(maxFreq, arr[ch - 'A']);

            while ((i - start + 1) - maxFreq > k) {

                arr[s.charAt(start) - 'A']--;
                start++;

            }

            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}