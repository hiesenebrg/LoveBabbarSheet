import java.util.Scanner;

public class ByteLandian_Coin {
    public static int bytelandian_coin(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(i , dp[i/2] + dp[i/3] + dp[i/4]);
        }
    return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(bytelandian_coin(n));
    }
}
