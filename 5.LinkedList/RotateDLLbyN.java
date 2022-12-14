/**
 * RotateDLLbyN
 */
public class RotateDLLbyN {

    static void rotate( int N)
{
    if (N == 0)
        return;
 
    // Let us understand the below code
    // for example N = 2 and
    // list = a <-> b <-> c <-> d <-> e.
    Node current = head;
 
    // current will either point to Nth
    // or NULL after this loop. Current
    // will point to node 'b' in the
    // above example
    int count = 1;
    while (count < N && current != null)
    {
        current = current.next;
        count++;
    }
 
    // If current is NULL, N is greater
    // than or equal to count of nodes
    // in linked list. Don't change the
    // list in this case
    if (current == null)
        return;
 
    // current points to Nth node. Store
    // it in a variable. NthNode points to
    // node 'b' in the above example
    Node NthNode = current;
 
    // current will point to last node
    // after this loop current will point
    // to node 'e' in the above example
    while (current.next != null)
        current = current.next;
 
    // Change next of last node to previous
    // head. Next of 'e' is now changed to
    // node 'a'
    current.next = head;
 
    // Change prev of Head node to current
    // Prev of 'a' is now changed to node 'e'
    (head).prev = current;
 
    // Change head to (N+1)th node
    // head is now changed to node 'c'
    head = NthNode.next;
 
    // Change prev of New Head node to NULL
    // Because Prev of Head Node in Doubly
    // linked list is NULL
    (head).prev = null;
 
    // change next of Nth node to NULL
    // next of 'b' is now NULL
    NthNode.next = null;
}
 
}