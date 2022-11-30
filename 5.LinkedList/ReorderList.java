public class ReorderList {
    Node reverse(Node node){
        Node prev=null;
        Node curr=node;
        Node nxt=null;
        
        while(curr!=null)
        {
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    
   }
    Node reorderlist(Node head) {
       Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node second = reverse(slow.next);
        slow.next = null;
        Node first = head;
        while(second!=null){
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
        return head;
    }
}
