public class LeafOfSameLevel {
    void solve(Node root, int h, int ma, boolean ans){
        if(root==null){
            return;
        }
        if(root.left ==null && root.right == null){
            if(ma==-1){
                ma = h;
            }else{
                if(h!=ma){
                    ans = false;
                }
            }
            return;
        }
        solve(root.left , h+1, ma, ans);
        solve(root.right , h+1, ma, ans);
    }
    boolean check(Node root)
    {
	// Your code here
	int ma = -1;
	int h = 0;
	boolean ans= true;
	solve(root, h, ma, ans);
	return ans;
    }
}
