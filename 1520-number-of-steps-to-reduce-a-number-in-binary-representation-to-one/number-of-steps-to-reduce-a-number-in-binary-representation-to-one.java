class Solution {
    public int numSteps(String s) {
        int i = s.length() - 1;
        int carry = 0;
        int count = 0;
        while (i > 0) {

            int bit = s.charAt(i) - '0' + carry;

            if (bit % 2 == 0) {
                count++;
            }

            else {

                carry = 1;
                count += 2;

            }

            i--;
        }

        return count+carry ; 
    }
}