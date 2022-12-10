import java.util.*;

public class ReverseQueue {
    public Queue<Integer> rev(Queue<Integer> q){
        if(q.isEmpty()){
            Queue<Integer> newq = new LinkedList<>();
            return newq;
        }
        int value = q.poll();
        Queue<Integer> ans = rev(q);
        ans.add(value);
        return ans;
    }
}
