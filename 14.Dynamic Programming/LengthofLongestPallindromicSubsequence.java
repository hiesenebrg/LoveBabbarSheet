import java.util.Arrays;

public class LengthofLongestPallindromicSubsequence {
    static int lps(char seq[], int i, int j, int dp[][])
    {
 
        // Base Case 1: If there is only 1 character
        if (i == j) {
            return dp[i][j] = 1;
        }
 
        // Base Case 2: If there are only 2 characters and
        // both are same then i become i+1 andj= j-1 that lead to index out of range so that is why we have take care of this extra case
        if (seq[i] == seq[j] && i + 1 == j) {
            return dp[i][j] = 2;
        }
        // Avoid extra call for already calculated subproblems, Just return the saved ans from cache
          if(dp[i][j] != -1){
          return dp[i][j];
        }
        // If the first and last characters match
        if (seq[i] == seq[j]) {
            return dp[i][j] = lps(seq, i + 1, j - 1, dp) + 2;
        }
 
        // If the first and last characters do not match
        return dp[i][j] = Math.max(lps(seq, i, j - 1, dp), lps(seq, i + 1, j, dp));
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String seq = "GEEKSFORGEEKS";
        int n = seq.length();
          int dp[][] = new int[n][n];
          for(int[] arr: dp)
          Arrays.fill(arr, -1);
        System.out.printf("The length of the LPS is %d",
                          lps(seq.toCharArray(), 0, n - 1, dp));
    }
}
