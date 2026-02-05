class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while ((x > 0) || (y > 0)) {

            System.out.println(x + " " + y);

            int a = x & 1;
            int b = y & 1;

            if ((a ^ b) == 1) {
                // System.out.println("a ->" + a + " : b-> " + b);
                count++;
            }

            x = x >> 1;
            y = y >> 1;
        }
        return count ; 
    }
}