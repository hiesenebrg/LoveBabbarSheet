import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;

public class BoundaryTraversal {
    public static void  LeftTree (BinaryTreeNode<Integer> root , ArrayList<Integer> ans) {
        if(root==null){
            return;
        }
        // here please note that for a node which has no left node then its right node act as a left node so we have
        // to add it to our answer too so please do not get confuse
        // focus on if and else if that only one recursion is only call each time not the both
        if(root.left!=null){
            ans.add(root.data);
            LeftTree(root.left, ans);
        }else if(root.right!=null){
                ans.add(root.data);
                LeftTree(root.right, ans);
        }
        
    }
    public static void leaf(BinaryTreeNode<Integer> root , ArrayList<Integer> ans) {
        if(root==null){
            return;
        }
        leaf(root.left, ans);
        if(root.left==null && root.right==null){
            ans.add(root.data);
        }
        leaf(root.right, ans);
        
    }
    public static void RightTree(BinaryTreeNode<Integer> root , ArrayList<Integer> ans) {
        if(root==null){
            return;
        } 
        // since we have to print the right order in reverse order that's why recursion is called first and then it added to the arraylu=ist that is ans
        if(root.right!=null){
            RightTree(root.right, ans);
            ans.add(root.data);
            
        }else if(root.left!=null){
            RightTree(root.left, ans);
                ans.add(root.data);
                
        }
    }
    public static ArrayList<Integer> printBoundary(BinaryTreeNode<Integer> root ) {
         ArrayList<Integer> ans = new ArrayList<>();
         ans.add(root.data);
         LeftTree(root, ans);
         leaf(root, ans);
         RightTree(root, ans);
         return ans;
    }
    public static void PrintTree(BinaryTreeNode<Integer> root) {  
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingnodess = new LinkedList<BinaryTreeNode<Integer>>();
        pendingnodess.add(root);
        while(!pendingnodess.isEmpty()){
            BinaryTreeNode<Integer> node = pendingnodess.peek();
            pendingnodess.poll();
            System.out.print(node.data + ": ");
            if(node.left!=null){
                System.out.print("L:" + node.left.data + " ");
                pendingnodess.add(node.left);
            }else{
                System.out.print("L:" + "-1" + " ");
            }
            if(node.right!=null){
                System.out.print("R:" + node.right.data + " ");
                pendingnodess.add(node.right);
            }else{
                System.out.print("R:" +"-1" + " ");
            }
            System.out.println();
        }
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
        ArrayList<Integer> ans = printBoundary(root);
        
        
            
        
        System.out.println(ans);
    }
}
// Boundary Traversal = leaf node + left boundary + right boundary(reverse order)