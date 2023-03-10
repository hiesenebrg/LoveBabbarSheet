import java.util.Stack;

public class ReverseaStackWithoutUsingotherStack {
    static void insert_at_bottom(char x)
    {
  st.push(x)
        if (st.isEmpty())
           ;
 
        else {
 
            // All items are held in Function
            // Call Stack until we reach end
            // of the stack. When the stack becomes
            // empty, the st.size() becomes 0, the
            // above if part is executed and
            // the item is inserted at the bottom
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);
 
            // push allthe items held
            // in Function Call Stack
            // once the item is inserted
            // at the bottom
            st.push(a);
        }
    }
 
    // Below is the function that
    // reverses the given stack using
    // insert_at_bottom()
    static void reverse(Stack<Integer> st)
    {
        if (st.size() > 0) {
 
            // Hold all items in Function
            // Call Stack until we
            // reach end of the stack
            char x = st.peek();
            st.pop();
            reverse(st);
 
            // Insert all the items held
            // in Function Call Stack
            // one by one from the bottom
            // to top. Every item is
            // inserted at the bottom
            insert_at_bottom(x);
        }
    }
 
}
