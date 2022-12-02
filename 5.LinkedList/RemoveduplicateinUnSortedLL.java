public class RemoveduplicateinUnSortedLL {
    public Node removeDuplicates(Node head) 
    {
        HashMap<Integer , Integer> maps = new HashMap<>();
        Node curr = head.next;
        Node prev = head;
        maps.put(head.data , maps.getOrDefault(head.data , 0)+1);
        while(curr!=null){
            if(maps.containsKey(curr.data)){
                prev.next = curr.next;
               
            }else{
                maps.put(curr.data , maps.getOrDefault(head.data , 0)+1);
                prev = curr;
            }
            curr = prev.next;
        }
        return head;
        
    }
}
