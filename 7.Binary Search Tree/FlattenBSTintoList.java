public class FlattenBSTintoList {
    static node prev;

    // Function to perform
    // in-order traversal
    static void Inorder(node curr) {
        // Base case
        if (curr == null)
            return;
        Inorder(curr.left);
        prev.left = null;
        prev.right = curr;
        prev = curr;
        Inorder(curr.right);
    }

    // Function to flatten binary
    // tree using level order
    // traversal
    static node flatten(node parent) {
        // Dummy node
        node dummy = new node(-1);

        // Pointer to previous
        // element
        prev = dummy;

        // Calling in-order
        // traversal
        Inorder(parent);

        prev.left = null;
        prev.right = null;
        node ret = dummy.right;

        // Delete dummy node
        // delete dummy;
        return ret;
    }
}
