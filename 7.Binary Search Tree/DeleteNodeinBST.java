

public class DeleteNodeinBST {
    public Node deleteNode(Node root, int key) {
        
        // key not in tree
        if(root == null)
            return root;
        
        if(root.val > key)
            root.left = deleteNode(root.left , key);
        
        else if(root.val < key)
            root.right = deleteNode(root.right , key);
        
        // node with key , found
        else{
            // case1 - leaf node
            if(root.left == null && root.right == null)
                return null;
            
            // case2 - 1 child
            if(root.left == null)
                return root.right;
            
            else if(root.right == null)
                return root.left;
            
            // case3 - 2 child
            Node next = nextInorderNode(root.right);
            root.val = next.val;
            root.right = deleteNode(root.right , next.val);
        }
        
        return root;
    }
     static Node nextInorderNode(Node node){
        // find leftmost node 
        
        while(node.left != null)
            node = node.left;
        
        return node;
    }
}
