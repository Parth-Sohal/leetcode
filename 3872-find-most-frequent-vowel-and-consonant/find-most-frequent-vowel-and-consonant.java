class Solution {
    public int maxFreqSum(String s) {
        char[] str = s.toCharArray();

        int[] vowels = new int[26];
        int[] consonants = new int[26];

        for (int i = 0; i < str.length; i++) {

            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                vowels[str[i] - 'a']++;
            } else {
                consonants[str[i] - 'a']++;
            }

        }

        int maxVowels = 0, maxConsonants = 0;

        for (int i = 0; i < 26; i++) {
            maxVowels = Math.max(maxVowels, vowels[i]);
            maxConsonants = Math.max(maxConsonants, consonants[i]);
        }


        return maxVowels + maxConsonants ;
    }
}