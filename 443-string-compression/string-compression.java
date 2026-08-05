class Solution {
    public int compress(char[] chars) {
        int i = 0;
        char currChar = chars[0];
        int updateIdx = 0;
        int count = 0;

        while (i < chars.length) {

            if (currChar == chars[i]) {
                count++;
            }

            else {

                chars[updateIdx++] = currChar;

                if (count < 10) {
                    if (count != 1) {
                        chars[updateIdx++] = (char) (count + '0');
                    }
                }

                else {

                    int start = updateIdx;

                    while (count > 0) {
                        int mod = count % 10;
                        chars[updateIdx++] = (char) (mod + '0');
                        count /= 10;
                    }

                    int end = updateIdx - 1;

                    while (start < end) {
                        char temp = chars[start];
                        chars[start] = chars[end];
                        chars[end] = temp;
                        start++;
                        end--;
                    }

                }

                currChar = chars[i];
                count = 1;

            }

            // System.out.println(Arrays.toString(chars));

            i++;

        }

        chars[updateIdx++] = currChar;

        if (count < 10) {
            if (count != 1) {
                chars[updateIdx++] = (char) (count + '0');
            }
        }

        else {

            int start = updateIdx;

            while (count > 0) {
                int mod = count % 10;
                chars[updateIdx++] = (char) (mod + '0');
                count /= 10;
            }

            int end = updateIdx - 1;

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }

        }

        return updateIdx ; 
    }
}