public class MinPallindromicPartitioning {
    static int palindromicPartition(String str)

    {
        
        boolean[][] dp = new boolean[str.length()][str.length()];
        for(int g=0;g<str.length();g++){
            for(int i = 0 , j= g; j<dp.length;i++,j++){
                if(g==0){
                    dp[i][j] = true;
                    
                }else if(g==1){
                    dp[i][j] = str.charAt(i)==str.charAt(j);
                }else{
                    if(str.charAt(i)==str.charAt(j) && dp[i-1][j-1]){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
            }
        }
        int [] dpp = new int[str.length()];
        dpp[0] = 0;
        for (int j = 1; j < dpp.length; j++) {
            if(dp[0][j]){
                dpp[j]=0;
            }else{

            int min  = Integer.MAX_VALUE;
            for (int i = j; i >=1; i--  ) {
                if(dp[i][j]){
                    if(dpp[i-1]<min){
                        min = dpp[i-1];
                    }
                }
                
            }
            dpp[j] = min+1;
        }
        }
        return dpp[str.length()-1];
    }
}
