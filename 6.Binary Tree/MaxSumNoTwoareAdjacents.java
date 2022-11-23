import java.util.HashMap;
class Node{
    int data;
    Node left , right;
    public Node( int data){
        this.data= data;
        this.left = null;
        this.right = null;
    }
}
public class MaxSumNoTwoareAdjacents {
    static HashMap<Node , Integer> dp = new HashMap<>();
    public static int solve(Node root) {
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int incl = root.data;
        if(root.left!=null){
            incl = incl +  solve(root.left.left) + solve(root.left.right) ;
        }
        if(root.right!=null){
            incl = incl +  solve(root.right.left) + solve(root.right.right);
        }
        int excl = solve(root.left) + solve(root.right);
        dp.put(root , Math.max(incl, excl));
        return dp.get(root);
    }
}
