public class IntersectionofLL {
    int intersectPoint(Node head1, Node head2)
	{
         Node ptr1 = head1;
         Node ptr2 = head2;
         int c1=0 , c2 = 0;
         while(ptr1!=null){
             c1+=1;
             ptr1 = ptr1.next;
         }
         while(ptr2!=null){
             c2+=1;
             ptr2 = ptr2.next;
         }
         ptr1 = head1;
         ptr2 = head2;
         int diff = Math.abs(c1-c2);
         if(c1>c2){
             for( int i = 0; i<diff;i++){
                 ptr1= ptr1.next;
             }
         }
         else{
             for( int i = 0; i<diff;i++){
                 ptr2= ptr2.next;
             }
         }
         while(ptr1!=ptr2){
             ptr1=ptr1.next;
             ptr2 = ptr2.next;
         }
         if(ptr1!=null) return ptr1.data;
         return -1;
	}
}
