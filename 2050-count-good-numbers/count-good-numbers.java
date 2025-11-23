class Solution {

    static final long mod = 1_000_000_007;

    public long powerRecursive(long a, long b) {
        if (b == 0) return 1;

        long half = powerRecursive(a, b / 2);
        half = (half * half) % mod;

        if (b % 2 == 1)
            return (half * a) % mod;

        return half;
    }

    public int countGoodNumbers(long n) {

        long oddIdx = n / 2;
        long evenIdx = n - oddIdx;

        long p1 = powerRecursive(5, evenIdx);
        long p2 = powerRecursive(4, oddIdx);

        return (int)((p1 * p2) % mod);
    }
}
