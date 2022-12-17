public class WildCardStringMatching {
    static int[][] dp;
    static int solve(String wild, String pattern ,int i , int j){
        if(i==-1 && j==-1) return 1;//means both string are ending simultaneuosly that means both strings matched
        if(j==-1){ //means pattern endedso we have check remaining wild can be replaced with empty string
            for(int k =0;k<i;k++){
                if(wild.charAt(k)!='*') return 0;
            }
            return 1;
        }
        if(i==-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(wild.charAt(i)==pattern.charAt(j) || wild.charAt(i)=='?') return dp[i][j] = solve(wild , pattern , i-1,j-1);
        if(wild.charAt(i)=='*'){
            int op1 = solve(wild , pattern , i,j-1);//one or more then one move
            int op2 = solve(wild , pattern , i-1,j); //for zero move
            if(op1+op2>0) return dp[i][j] = 1;
            else return dp[i][j] = 0;
        }
     return dp[i][j] =0;   
    }
    static boolean match(String wild, String pattern)
    {
         dp= new int[wild.length()][pattern.length()];
        for(int []dps:dp){
            Arrays.fill(dps,-1);
        }
        int x = solve(wild , pattern , wild.length()-1 , pattern.length()-1);
        if(x==1) return true;
        else return false;
    }
}
