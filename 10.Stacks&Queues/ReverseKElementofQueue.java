import java.util.*;
public class ReverseKElementofQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here
        Stack<Integer> stack = new Stack<>();;
        for( int i = 0;i<k;i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        } 
        for( int i = 0;i<q.size()-k;i++){
            q.add(q.poll());
        }
        return q;
    } 
}
