public class PallidromicPartitioning {
    public static int pallidromicPartitioning(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int g = 0; g < dp.length; g++) {
            for (int i = 0 , j=g; j < dp.length; i++ , j++) {
                if(g==0){
                    dp[i][j] = true;
                }else if(g==1){
                    dp[i][j] = s.charAt(i)==s.charAt(j);
                }else if(s.charAt(i)==s.charAt(j) && dp[i-1][j-1]){
                        dp[i][j] = true;
                }else{
                    dp[i][j] = false;
                }
            }
        }
        int[] storage = new int[dp.length];
        storage[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            if(dp[0][i]) storage[i] = 0;
            else{
                int mini = Integer.MAX_VALUE;
                for (int j = i; j >=1; j--) {
                    if(dp[j][i]){
                        mini = Math.min(storage[j-1] , mini);
                    }
                }
                storage[i] = 1+mini;
            }
        }
        return storage[storage.length-1];
    }
}
