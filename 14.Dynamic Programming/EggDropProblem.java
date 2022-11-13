public class EggDropProblem {
    static int eggDrop(int n, int k) 
	{
	    int[][] dp = new int[n+1][k+1];
	    for(int e = 1;e<=n;e++ ){
	        for(int f=1;f<=k;f++){
	            if(e==1){
	                dp[e][f] = f;
	            }else if(f==1){
	                dp[e][f] =1;
	            }else{
	                int min  = Integer.MAX_VALUE;
	               
	                for( int i =f-1 , j = 0 ;i>=0;i-- ,j++){
	                    int v1 = dp[e][i];  //egg survives
	                    int v2 = dp[e-1][j]; //egg breaks
	                    int max = Math.max(v1,v2);
	                    min = Math.min(min , max);
	                    
	                }
	                dp[e][f] = min+1;
	            }
	            
	        }
	    }
	    return dp[n][k];
	}
}
