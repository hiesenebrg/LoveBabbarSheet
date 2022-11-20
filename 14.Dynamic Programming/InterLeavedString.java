public class InterLeavedString {
    ublic int solve(String a ,String b  , String c  ,int n , int m,int len ,int[][] dp){
        if(len==0) return 1;
        if(dp[n][m]!=-1) return dp[n][m];
        int x = 0 , y = 0;
        if(n-1>=0 && a.charAt(n-1)==c.charAt(len-1)) x = solve(a,b,c, n-1,m,len-1,dp); 
          if(m-1>=0 && a.charAt(m-1)==c.charAt(len-1)) y = solve(a,b,c, n,m-1,len-1,dp);
          if(x+y==0) return dp[n][m] = 0;
          else return dp[n][m] = 1;
        }
	public boolean isInterLeave(String a,String b,String c)
	{
            int n = a.length();
            int m = b.length();
            int len  = c.length();
            if((n+m)!=len) return false;
            int[][] dp = new int[n+1][m+1];
            int ans =  solve(a,b,c,n,m,len,dp);
            if(ans==0){
                return false;
            }return true;
	}
}
