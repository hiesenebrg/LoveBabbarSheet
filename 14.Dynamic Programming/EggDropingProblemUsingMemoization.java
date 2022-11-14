import java.util.Arrays;

public class EggDropingProblemUsingMemoization {
    
    public int solve(int f , int e ,int[][]dp ){
        
        if(e==1) return f;            
        if(f==0) return 0;    
        if(dp[e][f]!=-1) return dp[e][f];
                    
                
        int ans=Integer.MIN_VALUE;    
        for(int i=1;i<=f;++i)
        {
            int broken=solve(e-1,i-1,dp);
            int notbroken=solve(e,f-i,dp);
            int maxval=Math.max(broken,notbroken);
            ans=Math.min(ans,maxval+1);
            }
        
        return dp[e][f]=ans;
    }
    public int eggDrop(int n, int k) 
    {
        
        int[][] dp = new int[n+1][k+1];
        for(int[] arr :dp){
            Arrays.fill(arr, -1);
        }
        return solve(n,k,dp);
    }
}

