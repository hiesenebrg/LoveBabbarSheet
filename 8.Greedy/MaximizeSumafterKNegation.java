import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Scanner;

public class MaximizeSumafterKNegation {
    public static int maximizesumafterKnegatation(int[] arr, int K) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && K != 0) {
                arr[i] = arr[i] * -1;
                K -= 1;
            }
            min = Math.min(min, arr[i]);

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (K % 2 != 0) {
            sum -= min;
        }
        return sum;
    }

    public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]  = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(maximizesumafterKnegatation(arr, k));
    }
}
