import java.util.Scanner;

/**
 * MinimumNumberofJumps
 */
public class MinimumNumberofJumps {
    public static int mnoj(int n , int [] arr) {
        int steps = arr[0];
        int maxreach = arr[0];
        int jumps = 1;
        for (int i = 1; i < n; i++) {
            if(i == arr.length-1){
                return jumps;
            }
            maxreach = Math.max(maxreach, i+arr[i]);
            steps-=1;
            if(steps==0){
                jumps+=1;
                if(i>maxreach){
                    return -1;
                }
                steps = maxreach-i;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.println(mnoj(n, arr));
    }
}