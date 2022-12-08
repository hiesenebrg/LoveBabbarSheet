public class MergeKSortedLL {
    Node merge(Node head1 , Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node result;
        if(head1.data<head2.data){
            result = head1;
            result.next = merge(head1.next ,head2 );
        }
        else{
            result = head2;
            result.next = merge(head1 , head2.next);
        }
        
        return result;
    }
   //Function to merge K sorted linked list.
   Node mergeKList(Node[]arr,int K)
   {
       int i = 0;
       int last  =K-1;
       int j;
       while(last!=0){
           i = 0;
           j =last;
           while(i<j){
               arr[i] = merge(arr[i] , arr[j]);
               i++;
               j--;
               if(i>=j){
                   last = j;
               }
           }
       }
       return arr[0];
   }
}
