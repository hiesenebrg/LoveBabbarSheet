import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Scanner;

public class CountAllPallindromicSubsequnce {
    public static int countAllPallindromicSubsequnce(String s , int i , int j , int[][] dp) {
        if(i>j){
            return 0;
        }
        // this will work on each character is a pallidrome
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i) ==s.charAt(j)){
            
        return dp[i][j] = countAllPallindromicSubsequnce(s, i+1, j, dp) + countAllPallindromicSubsequnce(s, i, j-1, dp)+1;
            
        }
        else{
            
            // now here let helper(s, i+1, j, dp) will count x pallindromic subsequnce and  helper(s, i, j-1, dp) this will count y pallindromic 
            // subsequnce now think both the recursuin called on nearly same string(only differ by 1 character each side) thus this result in
            // have some count common in both thus in order to correctr that we have to delete the value by this - helper(s, i+1, j-1, dp)
            // so that it remove the common value between them but we did not same thing to the above condition becase let say that will give
            // x+y count but remember the one char outside will lead to one more pallindromic subsequence to each from x+y pallindromic subsequnce

            return dp[i][j] = countAllPallindromicSubsequnce(s, i+1, j, dp) + countAllPallindromicSubsequnce(s, i, j-1, dp) - countAllPallindromicSubsequnce(s, i+1, j-1, dp);
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
        System.out.println(countAllPallindromicSubsequnce(s, 0, n-1, dp));
    }
    
}
