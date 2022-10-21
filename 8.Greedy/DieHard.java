import java.util.Arrays;
import java.util.Scanner;

public class DieHard {
    public static int diehard(int h , int a , int i , int[][ ]dp) {
        if(h<=0 || a<=0){
            return 0;
        }
        if(dp[h][a]!=-1){
            return dp[h][a];
        }
        int x=0 , y=0 , z = 0;
        if(i!=1){
            x = 1 + diehard(h+3, a+2 , 1 , dp);
        }
        if(i!=2){
            y = 1 + diehard(h-5, a-10 , 2 , dp);
        }
        if(i!=3){
            z = 1 + diehard(h-20, a+2 , 3 , dp);
        }
        return dp[h][a] = Math.max(Math.max(x,y) , z);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int[][] dp = new int[1000][1000];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
        System.out.println(Math.max(Math.max(diehard(h+3, a+2, 1, dp) , diehard(h-5, a-10, 2, dp)), diehard(h-20, a+2, 3, dp)));
    }
}
