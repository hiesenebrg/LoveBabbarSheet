public class PreOrdertoBST {
    static Node dfs(Node head, int ele){
        if(head==null){
           Node mpde  = new Node(ele);
           return mpde;
        }
        if(ele<head.data){
             head.left = dfs(head.left,  ele);
        }else{
            head.right = dfs(head.right,  ele);
        }
        return head;
    }
    public static Node post_order(int pre[], int size) 
    {
        Node root = new Node(pre[0]);
        for( int i =1 ;i<pre.length;++i){
           root= dfs(root , pre[i]);
        }
        return root;
    } 
}
