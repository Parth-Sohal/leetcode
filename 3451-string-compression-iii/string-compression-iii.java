class Solution {
    public String compressedString(String word) {

        int count = 0;
        char ch = word.charAt(0);
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while (i < word.length()) {

            if (word.charAt(i) == ch) {
                count++;
            } else {
                while (count > 9) {
                    ans.append((char) (9 + '0'));
                    ans.append(ch);
                    count -= 9;
                }
                ans.append((char) (count + '0'));
                ans.append(ch);

                count = 1;
                ch = word.charAt(i);

            }
            i++;
        }

        while (count > 9) {
            ans.append((char) (9 + '0'));
            ans.append(ch);
            count -= 9;
        }
        ans.append((char) (count + '0'));
        ans.append(ch);

        return ans.toString() ;

    }
}