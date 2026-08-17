class Solution {
    public int minTimeToType(String word) {
        int total = 0;
        char curr = 'a' ;


        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            int a = Math.abs(ch - curr) % 26;
            int b = 26 - a;

            int min = Math.min(a, b);
            curr = ch;

            total += (min) + 1;

        }

        return total ; 

    }
}