import java.util.Scanner;
import java.util.ArrayList;

public class KadaneAlgo {
    public static int kadanealgo(ArrayList<Integer> arr) {
        int curr_sum = arr.get(0);
        int total_sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (curr_sum >= 0) {
                curr_sum += arr.get(i);
            } else {
                curr_sum = arr.get(i);
            }
            if (total_sum < curr_sum) {
                total_sum = curr_sum;
            }
        }
        return total_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(kadanealgo(arr));
    }
}