public class BrothersFromDifferentRoots {
    static int c = 0;

    public static boolean fetch(Node root, int data) {
        if (root == null)
            return false;
        if (data == root.data)
            return true;
        boolean x = false;
        boolean y = false;
        if (data < root.data)
            x = fetch(root.left, data);
        else if (data > root.data)
            y = fetch(root.right, data);
        return x || y;
    }

    public static void solve(Node root1, Node root2, int k) {
        if (root1 == null)
            return;
        solve(root1.left, root2, k);
        if (fetch(root2, k - root1.data))
            c += 1;
        solve(root1.right, root2, k);
    }

    public static int countPairs(Node root1, Node root2, int x) {
        solve(root1, root2, x);
        return c;
    }
}
