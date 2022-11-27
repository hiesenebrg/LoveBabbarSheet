import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static int kthlargest(ArrayList<Integer> arr , int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr.get(i));
        }
        for (int i = k; i < arr.size(); i++) {
            int max = pq.peek();
            if(max<arr.get(i)){
                pq.poll();
                pq.add(arr.get(i));
            }
        }
        
        return pq.poll();
    }
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        
        Scanner sc  = new Scanner(System.in);
        while(true){
            int inpu = sc.nextInt();
            if(inpu==-1){
                break;
            }
            input.add(inpu);
        }
        int k = sc.nextInt();
        System.out.println(kthlargest(input , k));
    }
}
