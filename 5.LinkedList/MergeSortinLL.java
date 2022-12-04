public class MergeSortinLL {
    static Node mid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(slow!=null && fast!=null  && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }
    static Node mergeSortingRecursion(Node head)
    {
       
        
        if(head==null || head.next==null)return head;
        Node mid = mid(head);
        
        Node second = mid.next;
        mid.next = null;
        Node firstt = mergeSortingRecursion(head);
        Node secondd  = mergeSortingRecursion(second);
        Node sortedhead = mergeBoth(firstt, secondd);
         return sortedhead;
    }
    static Node mergeBoth(Node first , Node second){
        Node answer = null;
        if(first==null) return second;
        else if(second==null) return first;
        
        if(first.data<=second.data){
            answer = first;
            answer.next=  mergeBoth(first.next , second);
        }else{
            answer = second;
            answer.next = mergeBoth(first , second.next);
            
        }
        return answer;
    }
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head){
    Node ans = mergeSortingRecursion( head);
    return ans;
    }
}
