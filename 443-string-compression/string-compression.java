class Solution {
    private int greater(char[] str, int count, int idx) {
        int digits = 0;
        int num2 = count;

        while (num2 != 0) {
            digits++;
            num2 = num2 / 10;
        }

        idx += digits;
        num2 = count;

        while (num2 != 0) {
            str[idx] = (char) (num2 % 10 + '0');
            num2 = num2 / 10;
            idx--;
        }

        return digits;

    }

    public int compress(char[] chars) {

        if (chars.length == 1) {
            return 1;
        }

        int i = 0;
        int j = 1;
        int put = 0;
        int count = 1;

        while (j < chars.length) {

            if (chars[i] == chars[j]) {
                count++;
            }

            else {
                i = j;
                if (count == 1) {
                    chars[++put] = chars[i];
                } else if (count > 9) {
                    // System.out.println(count);
                    int plus = greater(chars, count, put);
                    put += plus;
                    chars[++put] = chars[i];
                } else {
                    chars[++put] = (char) (count + '0');
                    chars[++put] = chars[i];
                }
                count = 1;
            }

            j++;

        }

        if (count > 9) {
            int val = greater(chars, count, put);
            put += val;
        }  else if (count > 1) {
            chars[++put] = (char) (count + '0');
        }

        return put+1;

        

    }

}