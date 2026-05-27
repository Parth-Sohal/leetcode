class Solution {
    public int numberOfSpecialChars(String word) {

        int[] smallAplha = new int[26];
        int[] largeAplha = new int[26];

        Arrays.fill(smallAplha, -1);
        Arrays.fill(largeAplha, -1);

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                smallAplha[ch - 'a'] = i;
            } else {
                if (largeAplha[ch - 'A'] == -1) {
                    largeAplha[ch - 'A'] = i;
                }
            }

        }

        int count = 0;
        for (int i = 0; i < 26; i++) {

            if (smallAplha[i] != -1 && largeAplha[i] != -1 && smallAplha[i] < largeAplha[i]) {
                count++;
            }

        }

        return count;

    }

}