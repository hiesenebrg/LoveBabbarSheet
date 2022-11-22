public class LongestAlternatingSubsequence {
    public int AlternatingaMaxLength(int[] nums)
    {
      int n   = nums.length;
    //   if(n==1) return 1;
    //   int[][] dp = new int[n][2];
    //   for( int i = 0;i<n;i++){
    //       dp[i][0] = dp[i][1] = 1;
    //   }
    //   int ma = 0;
    //   for( int i = 1;i<n;i++){
    //       for( int j = 0;j<i;j++){
    //           if(nums[i]>nums[j] && dp[i][0]<dp[j][1]+1)  dp[i][0] = dp[j][1]+1;
    //           else if(nums[i]<nums[j] && dp[i][1]<dp[j][0]+1) dp[i][1] = dp[j][0]+1;
    //       }
    //       ma = Math.max(ma , Math.max(dp[i][0] , dp[i][1]));
    //   }
    //   return ma;
    // this will give Time complexity O(n^2) and Space Complexity O(2*n), so we have to optimize it
    int ma = 1 ;
    int mi = 1;
    for( int i = 1;i<n;i++){
        if(nums[i]>nums[i-1]){
            ma = mi+1;
        }else if(nums[i]<nums[i-1]){
            mi = ma+1;
        }
    }
    return Math.max(mi, ma);
    // this will give Time complexity O(n) and Space Complexity O(1)
}
