class Solution {
    public int numSteps(String s) {

        StringBuilder sb = new StringBuilder(s);
        int i = sb.length() - 1;
        int count = 0;
        int lastOne = 0;

        while (i > 0) {

            if (sb.charAt(i) == '1') {
                count++;

                while (i >= 0 && sb.charAt(i) == '1') {
                    count++;
                    i--;
                }

                if (i == -1) {
                    //                    count++;
                    break;
                }

                else {
                    sb.setCharAt(i, '1');
                }
            }

            else {
                count++;
                i--;
            }

        }

        return count;

    }
}