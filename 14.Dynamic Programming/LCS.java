

public class LCS {
    public static int  lcs(String s1 , String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = s1.length(); i >=0 ; i--) {
            for (int j = s2.length(); j >=0; j--) {
                if(i==s1.length() || j==s2.length()){
                    dp[i][j] = 0;               
                 }else if(s1.charAt(i) == (s2.charAt(j))){
                    dp[i][j] = 1+ dp[i+1][j+1];
                 }
                 else{
                    dp[i][j] = Math.max(dp[i+1][j] , dp[i][j+1]);
                 }
            }
        }
        
        return dp[0][0]; 
    }
    public static void main(String[] args) {
        String s1 = "adebc";
        String s2 = "dcadb";
        System.out.println(lcs(s1, s2));
    }
    
}
