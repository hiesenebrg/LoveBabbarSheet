public class FindMedaininBST {

    static int counNodes(Node root){
        if(root==null) return 0;
        return 1+ counNodes(root.left) + counNodes(root.right);
    }

    static void func(Node root,Node curr ,  Node prev , int c, int k , int f){
        if(root==null) return ;
        func(root.left , curr , prev , c,k,f);
        if(prev ==null){
            prev = root;
            c++;
        }else if(c==k){
            c++;
            curr = root;
            f=1;
            return;
        }else if(f==0){
            c++;
            prev = root;
        }
        func(root.right , curr , prev , c,k,f);
    }
static float findMedian(Node root){
    
    Node curr = null;
    Node prev = null;
    int c = 1;
    int x = counNodes(root)/2+1;
    int f = 0;
    func(root , curr , prev , c,x,f);
    if(x%2!=0){
        float ans = (float) ((curr.data)*1.0);
        return ans;
    }else{
        float ans = (float) (((curr.data + prev.data)*1.0)/(2*1.0));
        return ans;
    }
}
 
/* Driver code*/

}
