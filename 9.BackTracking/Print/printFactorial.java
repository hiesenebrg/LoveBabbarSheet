package Print;

import java.util.Scanner;

public class printFactorial {
    public static void printfactorial(int n, int answer ){
        if(n==0){
            System.out.println(answer);
            return;
        }
        answer = n *answer;
        printfactorial(n-1, answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printfactorial(n, 1);
    }
}
