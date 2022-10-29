import java.util.*;

public class PrintallKsumPathsinaBInaryTree {
    public static void printallKsumPathsinaBInaryTree(BinaryTreeNode<Integer>root, int k , ArrayList<Integer> ans) {
        if(root==null){
            return;
        }
        ans.add(root.data);
        printallKsumPathsinaBInaryTree(root.left, k, ans);
        printallKsumPathsinaBInaryTree(root.right, k, ans);
        int f = 0;
        for (int i = ans.size()-1; i>=0 ; i++) {
            f+=ans.get(i);
            if(f==k){
                for (int j = i; j <ans.size(); j++) {
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }
        }
        ans.remove(root.data);
    }
    public static void main(String[] args) {
        
    }
}
