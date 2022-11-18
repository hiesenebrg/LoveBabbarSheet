public class BSTfromInOrderandPreOrder {
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        // Your code goes here
        BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(preOrder, inOrder, 0, preOrder.length - 1, 0,
                inOrder.length - 1);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int pre[], int in[], int siPre, int eiPre, int siIn,
            int eiIn) {
        if (siPre > eiPre) {
            return null;
        }
        int rootData = pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (in[i] == rootData) {
                rootIndex = i;
                break;
            }
        }

        int siPreLeft = siPre + 1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int siInRight = rootIndex + 1;
        int eiInRight = eiIn;
        int eiPreRight = eiPre;

        int leftSubTreeLength = eiInLeft - siInLeft + 1;

        int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
        int siPreRight = eiPreLeft + 1;

        BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
        root.left = left;
        root.right = right;
        return root;
    }
}
