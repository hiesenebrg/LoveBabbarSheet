class Ans {
    boolean isBST;
    int size;
    int min;
    int max;

    public Ans(boolean isBST, int size, int min, int max) {
        this.isBST = isBST;
        this.size = size;
        this.min = min;
        this.max = max;
    }
}

class LargestBSTinBinaryTree {

    // Return the size of the largest sub-tree which is also a BST
    static Ans solve(Node root) {
        if (root == null)
            return new Ans(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        if (root.left == null && root.right == null)
            return new Ans(true, 1, root.data, root.data);
        Ans left = solve(root.left);
        Ans right = solve(root.right);

        if (left.isBST && right.isBST) {
            if (root.data > left.max && root.data < right.min) {
                boolean current_isBST = true;
                int current_max = right.max;
                int current_min = left.min;
                int current_size = left.size + right.size + 1;
                if (left.min == Integer.MAX_VALUE)
                    current_min = root.data;
                if (right.max == Integer.MIN_VALUE)
                    current_max = root.data;
                return new Ans(current_isBST, current_size, current_min, current_max);
            }
        }
        return new Ans(false, Math.max(left.size, right.size), 0, 0);
    }

    static int largestBst(Node root) {

        Ans anss = solve(root);
        return anss.size;
    }
}
