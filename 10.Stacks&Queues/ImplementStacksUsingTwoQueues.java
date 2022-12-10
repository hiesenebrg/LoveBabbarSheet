import java.util.*;

/**
 * ImplementStacksUsingTwoQueues
 */
public class ImplementStacksUsingTwoQueues {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
        q1.add(a);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
            
        }
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
    if(q2.isEmpty()){
        return -1;
    }
    else{
        return q2.poll();
    }
    }
}