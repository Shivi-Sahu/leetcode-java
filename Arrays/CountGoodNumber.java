
class Solution {

    static final long MOD = 1_000_000_007L;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenWays = findPower(5, even);
        long oddWays = findPower(4, odd);

        return (int) ((evenWays * oddWays) % MOD);
    }

    private long findPower(long a, long b) {

        // Base case
        if (b == 0) {
            return 1;
        }

        
        long half = findPower(a, b / 2);

       
        long result = (half * half) % MOD;

        if (b % 2 == 1) {
            result = (result * a) % MOD;
        }

        return result;
    }
}

    
