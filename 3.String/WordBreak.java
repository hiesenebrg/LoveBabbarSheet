public class WordBreak {
    public static boolean wordBreakdp(String s, ArrayList<String> dictionary) {
        // create a dp table to store results of subproblems
        // value of dp[i] will be true if string s can be segmented
        // into dictionary words from 0 to i.
        boolean[] dp = new boolean[s.length() + 1];
     
        // dp[0] is true because an empty string can always be segmented.
        dp[0] = true;
     
        for(int i = 0; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && dictionary.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    
    public static int wordBreak(String A, ArrayList<String> B )
    {
        
       if(wordBreakdp( A, B )){
           return 1;
       }
        return 0;
    }
}
