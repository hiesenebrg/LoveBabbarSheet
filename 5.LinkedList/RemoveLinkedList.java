public class RemoveLinkedList {
    Node removeDuplicates(Node head)
    {
	Node curr = head;
	while(curr.next!=null){
	    if(curr.data==curr.next.data){
	        if(curr.next.next!=null)
	            curr.next = curr.next.next;
	    else
	        curr.next = null;
	    }else{
	        curr = curr.next;
	}
	    }
	    
	return head;
    }
}
}
