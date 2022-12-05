public class ReverseDLL {
    public static Node reverseDLL(Node  head)
{
    Node curr = head;
    if(curr==null || curr.next ==null){
        return head;
        
    }
    while(curr.next!=null){
        curr= curr.next;
    }
    head=  curr;
    curr.next = curr.prev;
    curr.prev = null;
    curr = curr.next;
    while(curr.prev!=null){
        Node temp = curr.next;
        curr.next  = curr.prev;
        curr.prev = temp;
        curr = curr.next;
    }
    curr.prev = curr.next;
    curr.next = null;
    return head;
}
}
