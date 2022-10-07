import java.util.Scanner;

public class LootHouses {
    public static int lootHouses(int n , int[] houses) {
        int[] dp = new int[n];
        dp[0] = houses[0];
        dp[1]=Math.max(houses[1],dp[0]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(houses[i] + dp[i-2]  , dp[i-1]);
        }
        
        
        return dp[n-1];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] houses = new int[n];
        for (int i = 0; i <n; i++) {
            houses[i] = sc.nextInt();
        }
        System.out.println(lootHouses(n,houses));
    }
}
