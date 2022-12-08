public class sort0s1s2s {
    static Node segregate(Node head)
    {
       Node curr = head;
       int zeros = 0 , ones = 0 , twos = 0;
       while(curr!=null){
           if(curr.data==0) zeros++;
           else if(curr.data==1) ones++;
           else twos++;
           curr= curr.next;
       }
       int len = zeros + ones + twos;
       Node head1 = null , tail = null;
       
           while(zeros!=0){
           Node newNode = new Node(0);
           if(head1==null){
               head1  = newNode;
               tail = newNode;
           } 
           else{
               tail.next = newNode;
               tail = newNode;
           }
           zeros-=1;
        }
        while(ones!=0){
           Node newNode = new Node(1);
           if(head1==null){
               head1  = newNode;
               tail = newNode;
           } 
           else{
               tail.next = newNode;
               tail = newNode;
           }
           ones-=1;
        }
        while(twos!=0){
           Node newNode = new Node(2);
           if(head1==null){
               head1  = newNode;
               tail = newNode;
           } 
           else{
               tail.next = newNode;
               tail = newNode;
           }
           twos-=1;
        }
        return head1;
    }
}
