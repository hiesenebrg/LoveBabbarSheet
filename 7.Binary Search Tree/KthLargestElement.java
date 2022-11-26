public class KthLargestElement {
    static ArrayList<Integer> ans;

    public void solve(Node root) {
        if (root == null) {
            return;
        }
        solve(root.left);
        ans.add(root.data);
        solve(root.right);
    }

    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int K) {
        ans = new ArrayList<>();
        solve(root);
        // System.out.print(ans);
        return ans.get(ans.size() - K);
    }
}
