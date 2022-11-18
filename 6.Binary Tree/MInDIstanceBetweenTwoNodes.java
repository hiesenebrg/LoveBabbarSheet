public class MInDIstanceBetweenTwoNodes {
    Node lca(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.data == n1 || root.data == n2)
            return root;
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if (left != null && right != null)
            return root;
        if (left != null && right == null)
            return left;
        else
            return right;

    }

    int solve(Node root, int a) {
        if (root == null)
            return 0;
        if (root.data == a)
            return 1;
        int u = solve(root.left, a);
        int v = solve(root.right, a);
        if (u == 0 && v == 0) {
            return 0;
        } else {
            return 1 + u + v;
        }
    }

    int findDist(Node root, int a, int b) {
        // Your code here
        Node LCA = lca(root, a, b);
        int x = solve(LCA, a);
        int y = solve(LCA, b);
        // we are subtracting two beacuse LCA node is also included in both the x and y
        return x + y - 2;
    }
}
