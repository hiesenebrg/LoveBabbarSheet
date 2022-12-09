public class SegregateEvenOdd {
    Node divide(int N, Node head){
        Node odd = null;
        Node even = null;
        Node curr = head;
        Node odd_po = null;
        Node even_po = null;
        while(curr!=null){
            if (curr.data%2==0){
                if (even==null){
                    even = curr;
                    even_po = even;
                }
                else{
                    even_po.next = curr;
                    even_po = even_po.next;
            }
        }
            else{
                if (odd==null){
                    odd = curr;
                    odd_po = odd;
                }
                else{
                    odd_po.next = curr;
                    odd_po = odd_po.next;
                }
            }
            curr= curr.next;
        }
        if (odd_po!=null) odd_po.next = null;
        if (even_po!=null) even_po.next = null;
            
        if (even == null)  return odd;
        if (odd == null) return even;
        else{
            even_po.next = odd;
            return even;
        }
    }
}
