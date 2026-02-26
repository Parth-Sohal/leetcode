class Solution {
    public int numSteps(String s) {

        StringBuilder sb = new StringBuilder(s);

        // System.out.println(sb);
        int count = 0;
        while (sb.length() > 1) {

            char ch = sb.charAt(sb.length() - 1);

            if (ch == '0') {
                sb.deleteCharAt(sb.length() - 1);
            }

            else {
                int j = sb.length() - 1;

                while (j >= 0 && sb.charAt(j) == '1') {
                    sb.setCharAt(j, '0');
                    j--;
                }

                if (j == -1) {
                    sb.setCharAt(0, '1');
                    sb.append('0');
                }

                
                else{
                    sb.setCharAt(j, '1');
                }

            }

            // System.out.println(sb.toString());
            count++;

        }

        // System.out.println(count);

        return count ; 

    }
}