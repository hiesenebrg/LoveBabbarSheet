public class CountingValleys {
    public int catalanmethod(int steps){
    int[] dp = new int[steps+1];
        dp[0]=1;
        dp[1] = 1;
        for(int i = 2; i<dp.length;i++){
            int inside = i-1;
            int outside = i - inside;
            while(inside>=0){
                dp[i]+= dp[inside]*dp[outside];
                inside-=1;
                outside+=1;
            }
        }
        return dp[steps];

    }
}
