public class AddTwoNumber {
    static Node addTwoLists(Node first, Node second){
        first = reverse(first);
        second = reverse(second);
        int c = 0;
        int s = 0;
        Node temp ;
        Node res = null;
        Node curr = null;
        while(first!=null || second!=null){
            s = c+(first!=null?first.data:0) + (second!=null?second.data:0);
            c =(s>=10)?s/10:0;
            s = s%10;
            
            temp = new Node(s);
            if(res==null)res = temp;
            else curr.next = temp;
            curr =temp;
            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
        }
            if(c>0){
               temp = new Node(c);
               curr.next =temp;
               curr = temp;
             
            }
        
        return reverse(res);
        
      }
}
