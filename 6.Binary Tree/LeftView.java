import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.print.attribute.standard.QueuedJobCount;

public class LeftView {


    public static ArrayList<Integer> leftview(BinaryTreeNode<Integer> root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> pendingNodess = new LinkedList<>();
        pendingNodess.add(root);
        while(!pendingNodess.isEmpty())
        {
            int len  = pendingNodess.size();
             ans.add(pendingNodess.peek().data);
             while(len!=0){
                BinaryTreeNode<Integer> first  = pendingNodess.poll();
                if(first.left!=null){
                    pendingNodess.add(first.left);
                }
                if(first.right!=null){
                    pendingNodess.add(first.right);
                }
                len-=1;
             }
        }
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
        System.out.println(leftview(root));
        // PrintTree(root);

    }
}
