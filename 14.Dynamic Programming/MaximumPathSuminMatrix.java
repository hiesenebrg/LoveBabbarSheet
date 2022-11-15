public class MaximumPathSuminMatrix {
    static int maximumPath(int N, int Matrix[][])
    {
        int[][] dp = new int [N][N];
        int overall_max = Integer.MIN_VALUE;
        for(int i = dp.length-1;i>=0;i--){
            for(int j = dp[0].length-1;j>=0;j--){
                if(i== dp.length-1){
                    dp[i][j] = Matrix[i][j];
                }else if(j==dp[0].length-1){
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i+1][j] , dp[i+1][j-1]);
                }else if(j==0){
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i+1][j] , dp[i+1][j+1]);
                }
                else {
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i+1][j] ,Math.max(dp[i+1][j+1], dp[i+1][j-1])) ;
                }
                overall_max = Math.max(overall_max , dp[i][j]);
            }
        }
        
        return overall_max;
    }
}
