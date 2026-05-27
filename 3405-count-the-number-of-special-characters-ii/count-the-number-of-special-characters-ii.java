class Solution {
    public int numberOfSpecialChars(String word) {

        int[] smallAplha = new int[26];
        int[] largeAplha = new int[26];

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            int idx = ch - 'a';
            if (ch >= 'A' && ch <= 'Z') {
                idx = ch - 'A';
            }

            if (ch >= 'a' && ch <= 'z') {

                if (largeAplha[idx] == 1) {
                    smallAplha[idx] = -1;
                }

                else {
                    smallAplha[idx] = 1;
                }

            }

            else {

                largeAplha[idx] = 1;

            }

        }

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            if (smallAplha[i] == 1 && largeAplha[i] == 1) {
                ans++;
            }
        }

        return ans ; 

    }


}