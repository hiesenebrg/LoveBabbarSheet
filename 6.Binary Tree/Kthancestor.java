public class Kthancestor {
    public Node KthAncestor(Node root, int k, int node) {
        if (root == null)
            return null;
        if (root.data == node)
            return root;
        Node left = KthAncestor(root.left, k, node);
        Node right = KthAncestor(root.right, k, node);
        if (left != null && right == null) {
            k--;
            if (k <= 0) {
                k = Integer.MAX_VALUE;
                return root;
            }
            return left;
        }
        if (left == null && right != null) {
            k--;
            if (k <= 0) {
                k = Integer.MAX_VALUE;
                return root;
            }
            return right;
        }
        return null;
    }

    public int kthAncestor(Node root, int k, int node) {
        Node ans = KthAncestor(root, k, node);
        if (ans == null || ans.data == node) {
            return -1;
        }
        return ans.data;
    }
}
