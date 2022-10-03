import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;

public class BuyTheTicket {
    public static int buyTheTicket(int[] input , int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());

    for(int i : input){
            q.add(i);
            pq.add(i);
    }
    int count = 0;
    while(!pq.isEmpty()){
        if(q.peek().equals(pq.peek())){
            if(k==0){
                return count+1;
            }
            count++;
            q.poll();
            pq.poll();
            k-=1;
        }else{
            q.add(q.peek());
            q.poll();
            if(k==0){
                k = q.size()-1;
            }else{
                k-=1;
            }
        }
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K");
        int k = sc.nextInt();
        System.out.println("The ansswer is : " + buyTheTicket(arr, k));
    }
}
