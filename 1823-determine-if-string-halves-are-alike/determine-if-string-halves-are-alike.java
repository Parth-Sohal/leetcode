class Solution {
    public boolean halvesAreAlike(String s) {

        int vowelOne = 0;
        int vowelTwo = 0;
        // 0 1 2 3 4 5 6 7  8 / 2 = 4

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() / 2) {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e'
                        || s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                        s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'u') {
                    vowelOne++;
                }
            }

            else {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e'
                        || s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                        s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'u') {
                    vowelTwo
                    ++;
                }
            }
        }


        if(vowelOne == vowelTwo){
            return true;
        }

        return false;

    }
}