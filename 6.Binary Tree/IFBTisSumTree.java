public class IFBTisSumTree {
    boolean f = true;
    int solve(Node root){
        if( root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        if(f==false) return 0;
        int left = solve(root.left);
        int right = solve(root.left);
        if(left+right !=root.data) f= false;
        return left+right+root.data;
    }
	boolean isSumTree(Node root)
	{
	    f = true;
        solve(root);  
        return f;
	}
}
