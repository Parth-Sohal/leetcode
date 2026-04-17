class Solution {
    public int[] singleNumber(int[] nums) {

        long xor = 0;

        for (int i : nums) {
            xor ^= i;
        }

        // System.out.println(xor);

        long setBit = xor & -xor;

        

        // System.out.println(setBit);

        long bucket1 = 0; // setbit post ser
        long bucket2 = 0; // not set

        for (int i : nums) {
            if ((i & setBit) != 0) {
                bucket1 = bucket1 ^ i;
            } else {
                bucket2 = bucket2 ^ i;
            }
        }

        return new int[]{(int)bucket1,(int)bucket2};
    }
}