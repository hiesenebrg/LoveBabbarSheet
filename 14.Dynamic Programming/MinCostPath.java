public class MinCostPath {
    public static int mincostpath(int[][] cost) {
        int m = cost.length;
        int n = cost[0].length;
        
        int[][] dp = new int[m+1][n+1];
        
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = dp.length-2; i >=0 ; i--) { 
            for (int j = dp[0].length-2; j >=0; j--) {
                if(i==m-1 && j==n-1){
                    dp[i][j] = cost[i][j];
                    continue;
                }
                
                  dp[i][j] = Math.min(dp[i + 1][j] , Math.min(dp[i][j + 1], dp[i + 1][ j + 1])) + cost[i][j];
              }    
          }
        
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
        return dp[0][0];
        
    }
    public static void main(String[] args) {
        int[][] cost = {{10, 6, 9, 0},{-23, 8, 9, 90},{-200, 0 ,89, 200}};
        


        System.out.println(mincostpath(cost));
    }
}
