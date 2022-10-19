import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumCostOfRopes {
    public static int minimumcosrofropes(int[] arr , int n) {
        if(n==1){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        while(pq.size()>1){
            int x = pq.peek();
            pq.poll();
            int y = pq.peek();
            pq.poll();
            ans+=(x+y);
            pq.add(x+y);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumcosrofropes(arr, n));
    }
}
