class Solution {
    public int findComplement(int num) {
        if(num == 0)return 1 ;

        int ans = 0;
        int pow = 1;

        while (num != 0) {

            int mod = num & 1;

            if (mod == 0) {
                ans += pow;
            }

            pow *= 2;
            num = num >> 1;

        }

        return ans ;
    }
}