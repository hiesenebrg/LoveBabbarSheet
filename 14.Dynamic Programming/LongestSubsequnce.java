public class LongestSubsequnce {
    static int longestSubsequence(int N, int A[])
    {
        if(N==1){
        return 1;
    }
        
       int[] dp = new int[N]; 
    
    for(int i =1; i<dp.length;i++){
        dp[i] = 1;
    }
    dp[0]=1;
     int overall_max = 0;
     for(int i =1; i<dp.length;i++){
         int max = 0;
         for(int j = 0;j<i;j++){
             if(Math.abs(A[j]-A[i])==1){
                 if(dp[j]>max){
                     max = dp[j];
                 }
             }
         }
         dp[i] = max+1;
         if(dp[i]>overall_max){
             overall_max = dp[i];
         }
     }
     
     return overall_max;
    }
}

