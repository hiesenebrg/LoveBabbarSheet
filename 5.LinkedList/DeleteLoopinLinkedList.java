public class DeleteLoopinLinkedList {
    public static void removeLoop(Node head){
      
        if(head==null) return;
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
               
               break;
            }
        }
        //exception case
        if(slow==head){
            while(fast.next!=slow){
                fast= fast.next;
            }
            fast.next=null;
        }
        // normal case
        else if(slow==fast){
            slow=head;
            while(slow.next!=fast.next){
            slow=slow.next;
            fast =fast.next;
            }
        fast.next = null;
        }
        
       
    }
}
