public class ReverseLL {
    // can also be done using recursion by making a class of head and tail as done in coding ninjas
    public static Node reverse(Node head){
        Node next = null;
        Node prev = null;
        Node curr= head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            
        }
        return prev;
    }
}
