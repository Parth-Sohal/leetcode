class Solution {
    public String intToRoman(int num) {

        int curr = 1;
        StringBuilder sb = new StringBuilder();

        while (num > 0) {

            int mod = num % 10;

            if (curr == 1) {

                if (mod == 4) {
                    sb.append("VI");
                } else if (mod == 9) {
                    sb.append("XI");
                } else {

                    for (int i = 0; i < mod % 5; i++)
                        sb.append("I");
                    if (mod >= 5)
                        sb.append("V");

                }

            }

            else if (curr == 10) {

                if (mod == 4) {
                    sb.append("LX");
                } else if (mod == 9) {
                    sb.append("CX");
                } else {
                    for (int i = 0; i < mod % 5; i++)
                        sb.append("X");
                    if (mod >= 5)
                        sb.append("L");
                }

            }

            else if (curr == 100) {

                if (mod == 4) {
                    sb.append("DC");
                } else if (mod == 9) {
                    sb.append("MC");
                } else {
                    for (int i = 0; i < mod % 5; i++)
                        sb.append("C");
                    if (mod >= 5)
                        sb.append("D");
                }

            }

            else {
                for (int i = 0; i < mod; i++) {
                    sb.append("M");
                }
            }

            curr *= 10;
            num = num / 10;

        }

        return sb.reverse().toString();

    }
}

//MMMDCCXLIX