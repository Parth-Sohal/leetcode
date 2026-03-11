class Solution {
    public int bitwiseComplement(int n) {

        if(n == 0)return 1 ;

        int ans = 0;
        int pow = 1;

        while (n != 0) {

            int mod = n & 1;

            if (mod == 0) {
                ans += pow;
            }

            pow *= 2;
            n = n >> 1;

        }

        return ans ;
    }
}