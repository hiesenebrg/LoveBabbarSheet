public class MaxProfitKTransaction {
    static int maxProfit(int K, int N, int A[]) {
        int[][] dp = new int[K+1][N];
        for(int i = 1; i<=K; i++){
            for( int j = 1; j<N;j++){
                int maxi = dp[i][j-1];
                
                int loop_max = Integer.MIN_VALUE;
                for(int k = j-1; k>=0;k--){
                   int ans = dp[i-1][k] + A[j] - A[k];
                    loop_max = Math.max(loop_max , ans);
                }
                dp[i][j] = Math.max(loop_max, maxi);
            }
            
        }
        return dp[K][N-1];
      }
}
