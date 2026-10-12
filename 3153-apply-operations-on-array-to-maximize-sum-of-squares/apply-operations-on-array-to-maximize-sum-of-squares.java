class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long mod = 1000000007 ; 
        int[] bits = new int[32];

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int left = 0;
            while (num > 0) {
                if ((num & 1) == 1) {
                    bits[left]++;
                }
                num >>= 1;
                left++;
            }

        }

        // System.out.println(Arrays.toString(bits));

        long ans = 0;

        for (int i = 0; i < k; i++) {
            long n = 0;
            for (int j = bits.length - 1; j >= 0; j--) {
                if (bits[j] > 0) {
                    n += (long) Math.pow(2, j);
                    bits[j]--;
                }
            }

            ans += (n * n) % mod ;
            ans = ans % mod ; 

        }


        return (int)ans ; 


    }
}