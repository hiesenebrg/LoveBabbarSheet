public class ConvertBTintoBST {
    int index  = 0;
    void inorderTree(Node root , ArrayList<Integer> v ){
        if(root==null) return;
        inorderTree(root.left ,v);
        v.add(root.data);
        inorderTree(root.right ,v);
        
        
    }
    void inorderBST(Node root , ArrayList<Integer> v){
        if(root==null) return;
        inorderBST(root.left ,v );
     
        root.data = v.get(index);
        index++;
        
        inorderBST(root.right ,v );
        
    }
    Node binaryTreeToBST(Node root)
    {
      ArrayList<Integer> v = new ArrayList<>();
      inorderTree(root , v);
     
      Collections.sort(v);
      
      inorderBST(root,v  );
      return root;
    }
}
