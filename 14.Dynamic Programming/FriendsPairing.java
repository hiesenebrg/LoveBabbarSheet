import java.util.Scanner;

public class FriendsPairing {
    public static long countFriendsPairings(int n) { 
        long[] dp = new long[n+1];
        if(n==0){
            return 1;
        }
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2]*(i-1);
        }
        return  dp[n];
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(countFriendsPairings(n));
        }
}
