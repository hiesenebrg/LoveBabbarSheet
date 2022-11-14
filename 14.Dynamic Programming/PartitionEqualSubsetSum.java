public class PartitionEqualSubsetSum {
    static int solve(int index , int N , int[] arr, int target, int[][] dp){
        if(index>=N) return 0;
        if(target<0) return 0;
        if (target ==0) return 1;
        if(dp[index][target]!=-1){
            return dp[index][target];
        }
        int incl = solve(index+1 ,N,arr,target, dp);
        int excl = solve(index+1 , N, arr, target-arr[index],dp);
        if(incl==0 && excl==0){
           dp[index][target] = 0;  
        }else{
            dp[index][target]=1;
        }
         return dp[index][target];
        
    } 
    static int equalPartition(int N, int arr[])
    {
        
        int total = 0;
        for( int i = 0;i<N;i++ ){
            total+=arr[i];
        }
        if(total%2==1) return 0;
        int target = total/2;
        int[][] dp = new int[N][target+1];
        for(int[] arrs:dp){
            Arrays.fill(arrs, -1);
        }
        return solve(0 , N , arr, target, dp);
      
    }
}
