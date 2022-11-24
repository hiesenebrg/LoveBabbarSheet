public class ReplaceEveryELementwithSuccessor {
    Node insert(Node root, int data, Node succ) {
        if (root == null)
            return root = new Node();
        if (data < root.data) {
            succ = root.data;
            root.left = insert(root.left, data, succ);
        } else if (data > root.data) {
            root.right = insert(root.right, data, succ);
        }
        return root;
    }

    void replace(int[] arr, int n) {
        Node root = bull;
        for (int i = n - 1; i >= 0; i--) {
            Node succ = null;
            succ = insert(root, arr[i], succ);
            if (succ == null)
                arr[i] = -1;
            else
                arr[i] = succ.data;
        }
    }
}
