public class MatrixChianMultiplication {
    public static int mcm(int[] a , int[][] dp , int i , int j){
        if (i == j){
            return 0;
        }
        
        int a1 = 0 , a2 = 0 , min_val = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            
            if(dp[i][k]==-1){
                 a1 = mcm(a , dp, i, k);
                dp[i][k] = a1;
            }else{
                 a1 = dp[i][k];
            }
            if(dp[k+1][j]==-1){
                 a2 = mcm(a, dp, k+1, j);
                dp[k+1][j]= a2;
            }else{
                 a2  = dp[k+1][j];
        }
        int mCost = a[i-1]*a[k]*a[j];
        int curr_val = a1 + a2 +mCost;
        curr_val = a1 + a2 + mCost;
         min_val = Math.min(curr_val, min_val);
    }
    return min_val;
 
        
     
        
    }
    public static void main(String[] args) {
        
    }
}
