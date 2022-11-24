public class ReplacenodewithSuccessor {
    Node next = null;

    public void populateNext(Node root) {
        if (root != null) {
            // First set the next pointer in right subtree
            populateNext(root.right);

            // Set the next as previously visited node in
            // reverse Inorder
            root.next = next;

            // Change the prev for subsequent node
            next = root;

            // Finally, set the next pointer in left subtree
            populateNext(root.left);
        }

    }
}
