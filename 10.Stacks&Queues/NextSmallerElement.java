import java.util.*;
public class NextSmallerElement {
    public static void printNSE(int arr[], int n)
    {
        Stack<Integer> s = new Stack<Integer>();
        HashMap<Integer, Integer> mp
            = new HashMap<Integer, Integer>();
 
        /* push the first element to stack */
        s.push(arr[0]);
 
        // iterate for rest of the elements
        for (int i = 1; i < n; i++) {
 
            if (s.empty()) {
                s.push(arr[i]);
                continue;
            }
 
            /* if stack is not empty, then
    pop an element from stack.
    If the popped element is greater
    than next, then
    a) print the pair
    b) keep popping while elements are
    greater and stack is not empty */
 
            while (s.empty() == false
                   && s.peek() > arr[i]) {
                mp.put(s.peek(), arr[i]);
                s.pop();
            }
 
            /* push next to stack so that we can find
            next smaller for it */
            s.push(arr[i]);
        }
 
        /* After iterating over the loop, the remaining
        elements in stack do not have the next smaller
        element, so print -1 for them */
        while (s.empty() == false) {
            mp.put(s.peek(), -1);
            s.pop();
        }
 
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ---> "
                               + mp.get(arr[i]));
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNSE(arr, n);
    }
}
