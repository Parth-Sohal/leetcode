class Solution {
    public char processStr(String s, long k) {
        long length = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                length++;
            } else if ('*' == c) {
                length = Math.max(0  , length - 1);
            } else if ('#' == c) {
                length *= 2;
            }

        }

        if (k >= length) {
            return '.';
        }

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            

            if ('*' == ch) {
                length++;
            }

            else if ('#' == ch) {
                length = length / 2;

                if (k >= length) {
                    k = k - length;
                }

            }

            else if ('%' == ch) { // reverse
                k = length - k - 1;
            }

            else{
                length-- ;

                if(length == k){
                    return ch ; 
                }

            }
            

        }

        return '.';
    }
}