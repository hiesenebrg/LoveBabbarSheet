import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximizeSum {
    public static int maximizeSum(Integer[] arr) {
        int ans= 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            
                ans+=(arr[i]*i);
            
        } 
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximizeSum(arr));
    }
}
