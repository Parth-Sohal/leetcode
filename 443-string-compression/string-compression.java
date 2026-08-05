class Solution {
    public int compress(char[] chars) {
        int i = 0;
        char currChar = chars[0];
        int updateIdx = 0;
        int count = 0;

        while (i < chars.length) {
            if (currChar == chars[i]) {
                count++;
            } else {
                chars[updateIdx++] = currChar;
                updateIdx = appendCount(chars, updateIdx, count);

                currChar = chars[i];
                count = 1;
            }
            i++;
        }

        chars[updateIdx++] = currChar;
        updateIdx = appendCount(chars, updateIdx, count);

        return updateIdx;
    }

    // Extracted helper method to handle count writing and digit reversing
    private int appendCount(char[] chars, int updateIdx, int count) {
        if (count == 1) {
            return updateIdx;
        }

        if (count < 10) {
            chars[updateIdx++] = (char) (count + '0');
        } else {
            int start = updateIdx;
            while (count > 0) {
                chars[updateIdx++] = (char) ((count % 10) + '0');
                count /= 10;
            }

            // Reverse the inserted digits
            int end = updateIdx - 1;
            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return updateIdx;
    }
}