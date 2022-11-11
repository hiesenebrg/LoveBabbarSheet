/**
 * MaximizeTheCutSegments
 */
public class MaximizeTheCutSegments {

    static int[] dp = new int[10005];

    public int solve(int n, int x, int y, int z) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int op1 = Integer.MIN_VALUE, op2 = Integer.MIN_VALUE, op3 = Integer.MIN_VALUE;
        if (n >= x)
            op1 = solve(n - x, x, y, z);
        if (n >= y)
            op2 = solve(n - y, x, y, z);
        if (n >= z)
            op3 = solve(n - z, x, y, z);
        return dp[n] = 1 + Math.max(op1, Math.max(op2, op3));

    }

    // Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z) {

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        int a = solve(n, x, y, z);
        if (a < 0)
            return 0;
        return a;
    }
}