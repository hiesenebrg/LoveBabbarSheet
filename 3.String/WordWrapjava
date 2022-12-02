public class WordWrap {
    public int solveWordWrap (int[] nums, int k)
    {
        // Code here 
           int n=nums.length,dp[]=new int [n];

       dp[n-1]=0;

       for(int i=n-2;i>=0;i--){

           dp[i]=dp[i+1]+(k-nums[i])*(k-nums[i]);

           int len=nums[i];

           for(int j=i+1;j<n;j++){

               len+=nums[j]+1;

               if(len>k)break;

               if(j==n-1)dp[i]=0;

               else dp[i]=Math.min(dp[i],dp[j+1]+(k-len)*(k-len));

           }

       }

       return dp[0];
    }
}
