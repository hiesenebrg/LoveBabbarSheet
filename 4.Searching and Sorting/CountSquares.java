import java.net.SocketTimeoutException;
import java.util.Scanner;

public class CountSquares {
    public static int  countrsquares(int n) {
        int a = (int)(Math.sqrt(n));
        if(a*a==n){
            return a-1;

        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countrsquares(n));
    }
}
