import java.util.Scanner;

public class MinSquares {
    public static int minsquare(int n) {
        int[] dp = new int[n+1];
        if(n<4){
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        
        for(int i=4;i<=n;i++) {
			int ans=i;
			for(int j=1;j<=Math.sqrt(i);j++) {
				ans =Math.min(ans, dp[i-j*j]+1);
			}
			dp[i]=ans;
		}
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minsquare(n));
    }
}
