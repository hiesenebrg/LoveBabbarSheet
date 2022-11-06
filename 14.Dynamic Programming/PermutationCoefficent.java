import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/**
 * PermutationCoefficent
 */
public class PermutationCoefficent {
    // public static int answer(int[] dp , int n) {
    //     if(n==0){
    //         return 1;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }else{
    //         return dp[n] = n * answer(dp, n-1);
    //     }
        
    // }
    public static int answer(int n , int k) {
        int P = 1;
        for (int i = 0; i < k; i++) {
            P*=(n-i);
        }
        return P;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int[] dp = new int[n+1];
    // for (int i : dp) {
    //     dp[i] = -1;
    // }
    int k  = sc.nextInt();
    System.out.println(answer( n , k));
}
    
}