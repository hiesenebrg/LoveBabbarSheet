public class RemoveNthNodefromtheEndList {
    int getNthFromLast(Node head, int n)
    {
        Node curr =head;
    while(n!=1){
        curr = curr.next;
        if(curr==null) return -1;
        
        n-=1;
    }
    if(curr==null) return -1;
    Node currr = head;
    while(curr.next!=null){
        currr = currr.next;
        curr = curr.next;
        
    }
    return currr.data;
    }
}
