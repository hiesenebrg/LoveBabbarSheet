import java.util.Scanner;

// same as COin TOwer in COding Ninjas
public class CoinGame {
    public static String coinGame(int n, int x, int y) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            if (i == x || i == y) {
                dp[i] = 1;
                continue;
            }
            int op1 = dp[i - 1] ^ 1;
            int op2 = 0;
            if (i - x >= 1) {
                op2 = dp[i - x] ^ 1;

            }
            int op3 = 0;
            if (i - y >= 1) {
                op3 = dp[i - x] ^ 1;

            }
            dp[i] = Math.max(op1, Math.max(op2, op3));
        }
        if (dp[n] != 0) {
            return "ADARSH";
        } else {
            return "NIKHIL";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(coinGame(n, x, y));
    }
}
