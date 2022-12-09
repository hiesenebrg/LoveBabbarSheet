public class DeletesNodeshavinggreaterthanRight {
    Node reverse(Node head){
        Node prev  =null;
        Node curr = head;
        Node next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
            
    }
    Node compute(Node head)
    {
        head =reverse(head);
        Node prev = head;
        Node curr=  head;
        int max = head.data;
        curr = curr.next;
        while(curr!=null){
            if(curr.data>=max){
                prev.next = curr;
                prev = curr;
                max = curr.data;
            }
            curr= curr.next;
        }
        prev.next = null;
        head = reverse(head);
        return head;
    }
}
