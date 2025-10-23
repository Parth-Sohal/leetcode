class Solution {
    public boolean hasSameDigits(String s) {
        char[] str = s.toCharArray();

        // System.out.println(Arrays.toString(str));
        int l = str.length;

        for (int i = l - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                int sum = ((str[j] - '0') + (str[j + 1] - '0')) % 10;
                // System.out.print(sum + "    ");
                str[j] = (char) (sum + '0');
            }
            // System.out.println(Arrays.toString(str));
        }

        if(str[0] == str[1]){
            return true;
        }

        return false;
    }
}