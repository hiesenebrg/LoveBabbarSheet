public class AddOne {
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
    public static Node addOne(Node head) 
    { 
        head = reverse(head);
        boolean f = true;
        Node curr = head;
        while(curr!=null && f ==true){
            // remember curr.data should be equal to 1 not 0 because remember we are currently in reverse order
            if(curr.next==null && curr.data==9){
            curr.data = 1;
            Node temp = new Node(0);
            temp.next = head;
            head = temp;
            curr = curr.next;
            
            }else if(curr.data==9){
                curr.data = 0;
                curr = curr.next;
            }else{
                curr.data+=1;
                curr = curr.next;
                f=false;
            }
        }
        return reverse(head);
        }
}
