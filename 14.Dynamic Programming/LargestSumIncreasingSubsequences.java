public class LargestSumIncreasingSubsequences {
    static int longestSubsequence(int size, int a[])
    {
     int[] dp = new int[size];
     dp[0]=1;
     int overall_max = 0;
     for(int i =1; i<dp.length;i++){
         int max = 0;
         for(int j = 0;j<i;j++){
             if(a[j]<a[i]){
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
