import java.util.Scanner;

public class SubsetSumProblem {
    public static int subsetSumProblem(int[] dp , int[] arr , int sum, int i) {
        if(sum==0){
            return 1;
        }
        if(i==arr.length){
            return 0;
        }
        int ans1 = -1 , ans2 = -1 , ans3 = -1 ,  anss = 0;
        if(dp[i]!=-1){
            return dp[i];
            
            
        }else if(arr[i]>sum) {
            ans1 = subsetSumProblem(dp, arr, sum, i+1);
            return dp[i] = ans1;
        }
        else{
            ans2  = subsetSumProblem(dp, arr, sum, i+1);
            ans3 = subsetSumProblem(dp, arr, sum-arr[i], i+1);
            if(ans2+ans3>0){
                anss = 1;
            }
        }
        return dp[i] = anss;
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int sum = sc.nextInt();
        System.out.println(subsetSumProblem(dp, arr, sum, 0));

    }
}
