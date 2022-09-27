import java.util.Scanner;
// https://www.youtube.com/watch?v=bUSaenttI24

public class KnapsackProblem {
    public static int  knapsackproblem(int[] weight , int[] values , int maxweight) {
        int[][] dp = new int[weight.length+1][maxweight+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                // checking that can we pick more than one ball
                if(j>=weight[i-1]){
                    // excluding both the balls
                    if(dp[i-1][j]>=(values[i-1] + dp[i-1][j-weight[i-1]])){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        // including both the balls
                        dp[i][j] =  values[i-1] + dp[i-1][j-weight[i-1]];
                    }
                    }
                    // pick just the single ball available
                    else{
                        dp[i][j] = dp[i-1][j];
                        
                }
            }
        }
        
        return dp[weight.length][maxweight];
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] weight = new int[n];
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the weight for "+i+"th" + "index : ");
                weight[i] = sc.nextInt();
                System.out.print("Enter the value for "+i+"th" + "index : ");

                values[i] = sc.nextInt();

                
            }
            System.out.println("Enter the max weight");
            int maxweight = sc.nextInt();
            System.out.println(knapsackproblem(weight, values, maxweight));
                }
                
    }