public class MirrorOfaBinaryTree {
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root == null){
            return;
        }else{
        
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	
        }
        
        
	}
}
