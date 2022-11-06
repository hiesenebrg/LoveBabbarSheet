import java.util.*;

public class LargestSubtreeSum {
    public static int largestSubtreeSum(BinaryTreeNode<Integer> root , int ma) {
    if(root==null){
        return 0;
    }
    int left = largestSubtreeSum(root.left, ma);
    int right   = largestSubtreeSum(root.right, ma);
    int sum = root.data + left + right;
    ma = Math.max(ma ,sum ); 
    return sum;
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
    System.out.println(largestSubtreeSum(root,0));
    // PrintTree(root);

}
}
