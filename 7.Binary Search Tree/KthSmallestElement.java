public class KthSmallestElement {
    int count = 0;
    int ans = -1;

    public int KthSmallestElement(Node root, int K) {
        inorder(root, K);
        return ans;
    }

    public void inorder(Node root, int K) {
        if (root == null) {
            return;
        }
        inorder(root.left, K);
        count++;
        if (count == K) {
            ans = root.data;
            return;
        }
        inorder(root.right, K);
    }
}
