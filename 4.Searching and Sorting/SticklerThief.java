import java.util.Scanner;

public class SticklerThief {
    public static int sticklerThief(int[] dp , int [] arr , int n, int i) {
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int op1= arr[i] + sticklerThief(dp, arr, n, i+2);
        int op2 = sticklerThief(dp, arr, n, i+1);
        dp[i] = Math.max(op1, op2);
        return dp[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int [] arr = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sticklerThief(dp ,arr,n ,0));
    }
}
