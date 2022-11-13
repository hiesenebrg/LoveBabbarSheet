public class IsBalanced {
    boolean f = true;
    int ans(Node root){
        if(root == null){
            return 0;
        }
        int l = ans(root.left);
        int r = ans(root.right);
        if(Math.abs(l-r)>1){
            f = false;
        }
        return Math.max(l,r)+1;
    }
    boolean isBalanced(Node root)
    {
	
	int anss = ans(root);
	return f;
    }
}
