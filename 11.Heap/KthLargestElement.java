import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static ArrayList<Integer> kthlargest(ArrayList<Integer> arr , int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr.get(i));
        }
        for (int i = k; i < arr.size(); i++) {
            int min = pq.peek();
            if(min<arr.get(i)){
                pq.poll();
                pq.add(arr.get(i));
            }
        }
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }
        return ans;
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
