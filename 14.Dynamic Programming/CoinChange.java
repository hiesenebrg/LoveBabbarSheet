import java.util.Scanner;

public class CoinChange {
    public static long helper(int coins[], int N, int sum , long[][] dp , int i){
        if(i>=N && sum>0){
            return 0;
        }
        if(i>=N){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(dp[i][sum]!=-1){
            return dp[sum][i];
        }
        else{
        dp[i][sum] =  helper(coins , N ,sum-coins[i] ,dp ,  i ) + helper(coins , N ,sum ,dp ,  i+1 );
        return dp[i][sum];
        }
    }
    public static long count(int coins[], int N, int sum) {
        // code here.
        long [][]dp = new long[N][sum+1];
        for(int i = 0; i<dp.length;i++){
            for(int j = 0; j<dp[i].length; j++){
                dp[i][j] = -1;
            }
        }
        for(int i = 0; i<dp.length;i++){
            for(int j = 0; j<dp[i].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return helper(coins , N , sum , dp , 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();

        }
        int sum = sc.nextInt();
        System.out.println(count(coins, n, sum));
    }
}
