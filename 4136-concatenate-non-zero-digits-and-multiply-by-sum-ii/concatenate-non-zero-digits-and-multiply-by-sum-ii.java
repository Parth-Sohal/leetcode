class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int MOD = 1000000007;
        //        int mod = 1000000007;
        System.out.println(MOD);

        long[] runSum = new long[s.length() + 1];
        long[] digits = new long[s.length() + 1];
        long[] power10 = new long[s.length() + 1];
        long[] nonZero = new long[s.length() + 1];

        long currSum = 0;
        long digit = 0;
        long noZero = 0;
        power10[0] = 1L;

        for (int i = 0; i < s.length(); i++) {

            int d = s.charAt(i) - '0';

            if (d != 0) {
                digit = (digit * 10 + d) % MOD;
                currSum += d;
                noZero++;
            }

            runSum[i + 1] = currSum;
            digits[i + 1] = digit;
            nonZero[i + 1] = noZero;
            power10[i + 1] = power10[i] * 10 % MOD;

        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int L = queries[i][0];
            int R = queries[i][1] + 1;

            long sum = runSum[R] - runSum[L];
            long count = nonZero[R] - nonZero[L];

            long x = (digits[R] - (digits[L] * power10[(int) count]) % MOD + MOD) % MOD;

            ans[i] = (int) ((sum * x) % MOD);

        }


        return ans ; 

    }
}