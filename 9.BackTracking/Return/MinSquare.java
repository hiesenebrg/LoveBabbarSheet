import java.util.Scanner;

/**
 * MinSquare
 */
public class MinSquare {

public static int minSquare(int n) {
    if(n==0){
        return 0;
    }
    int minAns = Integer.MAX_VALUE;
    for (int i = 1; i*i <=n; i++) {
        int ans = minSquare(n-(i*i));
        if(ans<minAns){
            minAns = ans;
        }
    }
    return 1+minAns;
}  
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n  = sc.nextInt();
    System.out.println(minSquare(n));
}  
}