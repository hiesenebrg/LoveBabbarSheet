public class IsPallindrome {
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
    return node;
    }
   Node mid(Node head){
       Node slow = head;
       Node fast = head.next;
       while(fast!=null && fast.next!=null){
           fast = fast.next.next;
           slow = slow.next;
       }
       return slow;
   }
    boolean isPalindrome(Node head) 
    {
        Node middle = mid(head);
        Node head1 = middle.next;
        
        Node head2 = reverse(head1);
        middle.next = null;
        while(head!=null && head2!=null){
            if(head.data==head2.data){
                head= head.next;
                head2 = head2.next;
            }
                else{
                    return false;
                }
            
        }
        
    
    return true;
}
}
