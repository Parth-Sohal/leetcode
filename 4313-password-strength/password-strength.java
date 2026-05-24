class Solution {
    public int passwordStrength(String password) {

        int[] charArr = new int[256];

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                charArr[ch] = 1;
            }

            else if (ch >= 'A' && ch <= 'Z') {
                charArr[ch] = 2;
            }

            else if (ch >= '0' && ch <= '9') {
                charArr[ch] = 3;
            }

            else {
                charArr[ch] = 5;
            }

        }

        int sum = 0;

        // System.out.println(Arrays.toString(charArr));

        for (int i = 0; i < charArr.length; i++) {
            sum += charArr[i];
        }


        return sum ; 

    }
}