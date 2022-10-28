import java.util.*;

public class ZigZagTaversal {
    public static ArrayList<Integer> zigzagTraversal(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> pendingnodes = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        pendingnodes.add(root);
        int f = 1;
        while(!pendingnodes.isEmpty()){

            ArrayList<Integer> temp = new ArrayList<>();
            int size = pendingnodes.size();
            while(size!=0){
                BinaryTreeNode<Integer> first = pendingnodes.peek();
                temp.add(first.data);
                pendingnodes.poll();
                if(first.left!=null){
                    pendingnodes.add(first.left);
                }
                if(first.right!=null){
                    pendingnodes.add(first.right);
                }
                size-=1;
            }
            if(f%2!=0){
                for (int integer : temp) {
                    ans.add(integer);
                }
                
            }
            else{
                for (int i = temp.size()-1; i >=0; i--) {
                   ans.add(temp.get(i)); 
                }
            }

        f+=1;

    }
    return ans;
}
public static BinaryTreeNode<Integer> takeinputLevelWise(){
    Scanner s= new Scanner(System.in);
    int rootData= s.nextInt();

    if(rootData==-1) return null;

    BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
    Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
    pendingChildren.add(root);

    while(!pendingChildren.isEmpty()){
        BinaryTreeNode<Integer> front= pendingChildren.poll();
        System.out.println("Enter left child of "+ front.data);
        int left= s.nextInt();
        if(left!=-1){
                BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
                front.left= leftChild;
                pendingChildren.add(leftChild);
        }

        System.out.println("Enter right child of "+ front.data);
        int right= s.nextInt();
        if(right!=-1){
                BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
                front.right= rightChild;
                pendingChildren.add(rightChild);
        }
    }
    return root;

}
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeinputLevelWise();
        System.out.println(zigzagTraversal(root));
    }
}
