import java.util.*;
// nCr = C0*Cr-1 + C1*Cr-2 + ...+Cr-1*C0
public class ProgramfornthCatalanNumber {
    public static int programfornthCatalanNumber(int n) {
        int[] dp = new int[n+1];
        dp[0] =1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(programfornthCatalanNumber(n));
    }
}
