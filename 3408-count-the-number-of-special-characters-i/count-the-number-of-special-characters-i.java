class Solution {
    public int numberOfSpecialChars(String word) {

        int[] arr = new int[26];

        int bit = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                bit = bit | (1 << (ch - 'A' + 1));
            }

        }

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            // int mask = 1 << (ch - 'a');

            if (ch >= 'a' && ch <= 'z') {

                int mask = 1 << (ch - 'a' + 1);

                if ((bit & mask) != 0) {
                    count++;

                    // remove so duplicate lowercase doesn't count again
                    bit = bit ^ mask;
                }
            }

        }

        return count;

    }
}