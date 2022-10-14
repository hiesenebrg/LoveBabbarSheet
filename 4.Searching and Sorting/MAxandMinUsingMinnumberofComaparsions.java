import java.util.Scanner;

public class MAxandMinUsingMinnumberofComaparsions {
    public static int MiddleofThree(int A, int B , int C) {
        if((B>A && B<C) || (B>C && B<A) ){
            return B;
        }
        
    else if((C>A && C<B) || (C>B && C<A)){
        return C;
    }
        
    else{
        return A;
    }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(MiddleofThree(A, B, c));
    }
}
