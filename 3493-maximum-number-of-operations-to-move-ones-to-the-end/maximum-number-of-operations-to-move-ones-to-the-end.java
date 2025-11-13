class Solution {
    public int maxOperations(String s) {
        StringBuilder sb = new StringBuilder(s);

        int count = 0;
        int i = 0;

        int oneCount = 0;
        int zeroCount = 0;

        while (i < sb.length()) {

            if (sb.charAt(i) == '1') {
                oneCount++;
            }

            else {
                while (i < sb.length() && sb.charAt(i) == '0') {
                    i++;
                }
                i--;

                count += oneCount;
            }

            i++;

        }

        return  count ;
    }
}