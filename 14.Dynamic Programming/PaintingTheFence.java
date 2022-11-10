public class PaintingTheFence {
    long countWays(int n, int k) {
        long mod = 1000000007;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        long same = k % mod;
        long differ = (k * (k - 1)) % mod;

        for (int i = 3; i <= n; i++) {
            long prev = differ % mod;
            differ = ((same + differ) * (k - 1)) % mod;
            same = prev % mod;

        }
        return (same + differ) % mod;
    }
}
