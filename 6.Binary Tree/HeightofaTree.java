public class HeightofaTree {


	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1+ Math.max(left, right);
	}


}
