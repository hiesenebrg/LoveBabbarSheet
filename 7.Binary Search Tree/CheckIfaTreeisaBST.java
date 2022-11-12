/**
 * CheckIfaTreeisaBST
 */
public class CheckIfaTreeisaBST {

    boolean func(Node root,int min , int max){
        if(root==null){
            return true;
        }
        if(root.data<min || root.data>max){
            return false;
        }
        return (func(root.left, min , root.data-1) && func(root.right , root.data+1 , max));
    }
    boolean isBST(Node root)
    {
       return func(root, Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
}