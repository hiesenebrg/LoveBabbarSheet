import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TrappingRainWater {
    public static int trw(int n , int [] arr) {
        ArrayList<Integer> lr = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                maxi = Math.max(maxi, arr[i]);
            lr.add(maxi);
        }
        ArrayList<Integer> rh = new ArrayList<>();
        int mini = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0 ; i--) {
                mini = Math.max(mini, arr[i]);
            rh.add(mini);
        }
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.min(rh.get(i) , lr.get(i)) - arr[i];
        }
        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            sum+=ans[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(trw(n, arr));
    }
}
