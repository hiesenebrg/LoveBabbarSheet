public class CheckIfCircularLinkedList {
    boolean isCircular(Node head)
    {
	    HashMap<Node , Integer> maps = new HashMap<>();
    	while(head!=null){
    	    if(maps.containsKey(head)) return true;
    	    else maps.put(head , maps.getOrDefault(head , 0)+1);
    	    head = head.next;
    	}
	    return false;
    }
}
