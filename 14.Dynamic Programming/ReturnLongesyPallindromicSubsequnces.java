import java.util.Scanner;

public class ReturnLongesyPallindromicSubsequnces {
    public static int longestPalindrome(String s) {
        int n = s.length();
        int ans = 0;
        boolean[][] dp = new boolean[n][n];
        for( int g = 0 ; g<n;g++){
            for( int i = 0, j =g;j<n;i++,j++){
                if(g==0){
                    dp[i][j] =true;
                }else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
            }
            if(dp[i][j]){
                ans = i*10+j;
                
                // System.out.println(ans);
            }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int anss = longestPalindrome(s);
        System.out.println(s.substring(anss/10 , anss%10+1));
    }
}

