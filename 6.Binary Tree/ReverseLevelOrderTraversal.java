import java.util.*;

public class ReverseLevelOrderTraversal {
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
      if (node == null) {
            return ans;
        }
 
        // create an empty queue and enqueue the root node
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
 
        // create a stack to reverse level order nodes
        Deque<Integer> stack = new ArrayDeque<>();
 
        // to store the current node
        Node curr;
 
        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // process each node in the queue and enqueue their children
            curr = queue.poll();
 
            // push the current node into the stack
            stack.push(curr.data);
 
            // it is important to process the right node before the left node
            if (curr.right != null) {
                queue.add(curr.right);
            }
 
            if (curr.left != null) {
                queue.add(curr.left);
            }
        }
 
        // pop all nodes from the stack and print them
        while (!stack.isEmpty()) {
            ans.add(stack.poll());
        } 
        return ans;
    }
}
