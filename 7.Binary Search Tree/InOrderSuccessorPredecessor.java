/**
 * InOrderSuccessor&Predecessor
 */
public class InOrderSuccessorPredecessor {
    public static Node inpre(Node root) {
        Node left = root.left;
        while (left.right != null) {
            left = left.right;
        }
        return left;
    }

    public static Node insuc(Node root) {

        Node right = root.right;
        while (right.left != null) {
            right = right.right;
        }
        return right;
    }

    public static void findPreSuc(Node root, Res p, Res s, int key) {
        if (root == null)
            return;
        if (root.data == key) {
            if (root.left != null)
                p = inpre(root);
            if (root.right != null)
                s = insuc(root);
            return;
        }
        if (key > root.data) {
            p = root;
            findPreSuc(root.right, p, s, key);
        } else if (key < root.data) {
            s = root;
            findPreSuc(root.left, p, s, key);
        }
    }

}