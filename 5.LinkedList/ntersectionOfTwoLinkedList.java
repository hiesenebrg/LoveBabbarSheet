public class ntersectionOfTwoLinkedList {
    public static Node findIntersection(Node head1, Node head2)
    {
        Node ptr1 = head1;
        Node ptr2 = head2;
        Node head =  null;
        Node curr = null;
        while(ptr1!=null&& ptr2!=null){
            if(ptr1.data==ptr2.data){
                if(head==null){
                    Node temp  = new Node(ptr1.data);
                    head = temp ;
                    curr = temp;
                }else{
                     Node temp  = new Node(ptr1.data);
                     curr.next = temp;
                     curr = temp;
                }
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            else{
                if(ptr1.data<ptr2.data){
                    ptr1 = ptr1.next;
                }else{
                    ptr2 = ptr2.next;
                }
            }
        }
        return head;
}
