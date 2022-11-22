public class MinSquarestoRepresentN {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            int ans = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                ans = Math.min(ans, dp[i - j * j]);
            }
            dp[i] = ans + 1;
        }
        return dp[n];
    }
}
