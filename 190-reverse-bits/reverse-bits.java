class Solution {
    public int reverseBits(int n) {
        
        int count = 0;
        int ans = 0;

        while (count <= 31) {

            ans = ans << 1;

            if ((n & 1) == 1) {
                ans = ans | 1;
            }

            n = n >> 1;

            System.out.println("n = " + n + " ans = " + ans);

            count++;

        }

        return ans ; 
    }
}