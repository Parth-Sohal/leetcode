class Solution {
    public String compressedString(String word) {
        
        StringBuilder sb = new StringBuilder(word.length());

        int count = 1;
        char ch = word.charAt(0);
        int i = 1;

        while (i < word.length()) {

            if (word.charAt(i) == ch) {
                count++;
                if (count == 9) {
                    sb.append(count);
                    sb.append(ch);
                    i++;
                    if (i < word.length()) {
                        ch = word.charAt(i);
                        count = 1;
                    }
                    //                    continue;
                }
            }

            else {
                sb.append(count);
                sb.append(ch);
                count = 1;
                ch = word.charAt(i);
            }

            i++;
        }

        if(count!=9){
            sb.append(count);
            sb.append(ch);
        }

        return sb.toString();
        
    }
}