class Solution {
    private final long MOD = 1_000_000_007; // 10^9 + 7 as requested

    public int countGoodNumbers(long n) {
        // Calculate number of even and odd indices
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        // Calculate (5^evenPositions) % MOD and (4^oddPositions) % MOD
        long evenChoices = power(5, evenPositions);
        long oddChoices = power(4, oddPositions);

        // Combine the choices and apply modulo one last time
        return (int) ((evenChoices * oddChoices) % MOD);
    }

    // Fast power function O(log exp) to prevent Time Limit Exceeded (TLE)
    private long power(long base, long exp) {
        long res = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) { // If the exponent is odd
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD; // Square the base
            exp >>= 1; // Divide exponent by 2
        }

        return res;
    }
}

