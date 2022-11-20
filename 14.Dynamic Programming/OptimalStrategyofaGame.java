import java.util.Arrays;

public class OptimalStrategyofaGame {
    static long solution(long[][]dp , int[] arr , int n , int i , int j){
        if (i>j) return 0;
        if (dp[i][j]!=-1) return dp[i][j];
        long x = (long)(arr[i] + Math.min(solution(dp,arr,n,i+2,j),solution(dp,arr,n,i+1,j-1)));
        long y = (long)(arr[j] + Math.min(solution(dp,arr,n,i+1,j-1),solution(dp,arr,n,i,j-2)));
        dp[i][j] = Math.max(x,y);
        return dp[i][j];
    }
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
         
       long[][] dp = new long[n+1][n+1];
       for(long[]arrs:dp){
           Arrays.fill(arrs,-1);
       }
        return solution(dp,arr,n,0,n-1);
       
    }
}
