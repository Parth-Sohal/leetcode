class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollar = 0;
        int tenDollar = 0;

        // Arrays.sort(bills);

        for (int money : bills) {

            if (money == 5) {
                fiveDollar++;
            }

            else if (money == 10) {

                if (fiveDollar == 0) { // no change 
                    return false;
                }

                fiveDollar--;
                tenDollar++;

            }

            else {

                if (tenDollar >= 1 && fiveDollar >= 1) {
                    tenDollar--;
                    fiveDollar--;
                }

                else if (fiveDollar >= 3) {
                    fiveDollar -= 3;
                }

                else {
                    return false;
                }

            }

        }

        return true;
    }
}