public class MultiplytwoLL {
    public long multiplyTwoLists(Node l1,Node l2){
        long mod = 1000000007;
        long num1 =0 , num2= 0;
           Node p1 = l1;
           Node p2 = l2;
           while(p1!=null){
               num1 = (num1*10+p1.data)%mod;
               p1= p1.next;
           }
           while(p2!=null){
               num2 = (num2*10+p2.data)%mod;
               p2 = p2.next;
           }
           return (num1*num2)%mod;
    }
}
